package pkg2;
import java.io.*;
import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> votes = new ArrayList<>();

        // Step 1: Read candidates and votes from the input file
        try (BufferedReader br = new BufferedReader(new FileReader("input1.txt"))) {
            String line;
            boolean isVoteSection = false;

            while ((line = br.readLine()) != null) {
                if (line.trim().equalsIgnoreCase("Votes:")) {
                    isVoteSection = true;
                    continue;
                }

                if (isVoteSection) {
                    votes.add(line.trim());
                } else {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        votingSystem.addCandidate(new Candidate(parts[0].trim(), parts[1].trim()));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Step 2: Cast votes
        for (String vote : votes) {
            votingSystem.castVote(vote);
        }

        // Step 3: Display results and winners on the console
        System.out.println(votingSystem.getResults());
        System.out.println(votingSystem.getWinners());
    }
}