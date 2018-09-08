package pool;

import java.util.List;

public class Poll {

    private int votes;

    public Poll(List<Integer> candidates) {
        this.votes = 0;
    }

    public void addVote(Integer candidate) {
        this.votes = this.votes+1;
    }

    public Integer totalVotes() {
        return this.votes;
    }
}
