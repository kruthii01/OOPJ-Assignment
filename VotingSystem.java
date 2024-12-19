package pkg2;
import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Candidate> candidates;

    public VotingSystem() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void castVote(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equalsIgnoreCase(name)) {
                candidate.addVote();
                return;
            }
        }
    }

    public String getResults() {
        StringBuilder results = new StringBuilder();
        results.append("Election Results:\n");
        for (Candidate candidate : candidates) {
            results.append(candidate.getPosition())
                    .append(" - ")
                    .append(candidate.getName())
                    .append(": ")
                    .append(candidate.getVotes())
                    .append(" votes\n");
        }
        return results.toString();
    }

    public String getWinners() {
        StringBuilder winners = new StringBuilder();
        winners.append("\nElection Winners:\n");
        candidates.stream()
                .map(Candidate::getPosition)
                .distinct() // Get unique positions
                .forEach(position -> {
                    Candidate winner = candidates.stream()
                            .filter(c -> c.getPosition().equalsIgnoreCase(position))
                            .max((c1, c2) -> Integer.compare(c1.getVotes(), c2.getVotes()))
                            .orElse(null);
                    if (winner != null) {
                        winners.append("Congratulations to ")
                                .append(winner.getName())
                                .append(" for winning the position of ")
                                .append(winner.getPosition())
                                .append("!\n");
                    }
                });
        return winners.toString();
    }
}