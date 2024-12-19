# OOPJ-Assignment
*Here we are using SpringTool Software.

1. Candidate.java

This class represents a candidate for a particular position in the election.
Attributes:
private String name: Stores the name of the candidate.
private String position: Stores the position the candidate is contesting for (e.g., President, Vice President, Secretary).
private int votes: Stores the number of votes the candidate has received.

Methods:
public Candidate(String name, String position): Constructor to initialize the candidate’s name and position.
public String getName(): Returns the name of the candidate.
public String getPosition(): Returns the position of the candidate.
public int getVotes(): Returns the number of votes the candidate has received.
public void addVote(): Increments the vote count of the candidate.


2. VotingSystem.java
This class represents the voting system which handles the election process.
Attributes:
private ArrayList<Candidate> candidates: A list of candidates participating in the election.


Methods:
public VotingSystem(): Constructor to initialize the list of candidates.
public void addCandidate(Candidate candidate): Adds a candidate to the list of candidates.
public void castVote(String name): Casts a vote for a candidate by name.
public String getResults(): Returns the voting results (each candidate and their respective vote count).
public String getWinners(): Determines and returns the winner for each position (President, Vice President, Secretary) with a congratulatory message.


3. TestClass.java
This class is used to test the functionality of the voting system.
Methods:
public static void main(String[] args): The main method that runs the program. It creates candidates, casts votes, and prints results and winners.

No Interfaces Used:

This program does not use any interfaces. It primarily uses classes (Candidate, VotingSystem, TestClass) to manage candidates, votes, and the election system.
