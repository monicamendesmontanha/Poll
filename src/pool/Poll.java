package pool;

import java.util.List;

public class Poll {

    private int votes;
    private List<Integer> candidates;

    public Poll(List<Integer> candidates) {
        this.candidates = candidates;
        this.votes = 0;
    }

    public void addVote(Integer candidate) {
        if (this.candidates.contains(candidate)) {
            this.votes = this.votes + 1;
        }
    }

    public Integer totalVotes() {
        return this.votes;
    }
}
