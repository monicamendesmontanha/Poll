package pool;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoolTest {

    @Test
    public void shouldReturnTotalVotes() {

        List<Integer> candidates = new ArrayList<>();
        candidates.add(1);
        candidates.add(2);
        candidates.add(3);

        Poll poll = new Poll(candidates);
        poll.addVote(1);
        poll.addVote(1);
        poll.addVote(2);
        poll.addVote(3);

        assertEquals(new Integer(4), poll.totalVotes());
    }

    @Test
    public void shouldCountOnlyValidCandidates() {

        List<Integer> candidates = new ArrayList<>();
        candidates.add(1);
        candidates.add(2);

        Poll poll = new Poll(candidates);
        poll.addVote(1);
        poll.addVote(2);
        poll.addVote(3);

        assertEquals(new Integer(2), poll.totalVotes());
    }

}
