package pkg2;
public class Candidate {
    private String name;
    private String position;
    private int votes;

    public Candidate(String name, String position) {
        this.name = name;
        this.position = position;
        this.votes = 0;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getVotes() {
        return votes;
    }

    public void addVote() {
        votes++;
    }
}