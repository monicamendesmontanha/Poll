import pool.Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        List<Integer> candidates = new ArrayList<>();
        candidates.add(1);
        candidates.add(2);
        candidates.add(3);
        candidates.add(4);
        candidates.add(5);
        candidates.add(6);
        candidates.add(7);
        candidates.add(8);
        candidates.add(9);
        candidates.add(10);
        candidates.add(11);

        Poll poll = new Poll(candidates);

        poll.addVote(candidateNumber());

        displayTotalVotes(poll);
    }

    private static int candidateNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Which number would you like to vote? ");
        int candidateNumber = reader.nextInt();
        reader.close();

        return candidateNumber;
    }

    private static void displayTotalVotes(Poll poll) {
        System.out.println("Total votes: " + poll.totalVotes());
    }
}