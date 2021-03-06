package pool;

import java.util.*;

public class Poll {

    private Map<Integer, Integer> candidates;

    public Poll(List<Integer> candidates) {
        this.candidates = new HashMap<>();
        for (Integer candidate : candidates) {
            this.candidates.put(candidate, 0);
        }
    }

    public void addVote(Integer candidate) {
        if (this.candidates.containsKey(candidate)) {
            int votes = this.candidates.get(candidate);
            this.candidates.replace(candidate, votes + 1);
        }
    }

    public Integer totalVotes() {
        int totalVotes = 0;
        Collection<Integer> allVotes = this.candidates.values();

        for (Integer votes : allVotes) {
            totalVotes = totalVotes + votes;
        }

        return totalVotes;
    }

    public List<Candidate> candidatesWithVotes() {
        Set<Integer> candidateIds = this.candidates.keySet();
        List<Candidate> candidatesWithVotes = new ArrayList<>();
        for (Integer id : candidateIds) {
            Integer votes = this.candidates.get(id);
            candidatesWithVotes.add(new Candidate(id, votes));
        }

        return candidatesWithVotes;
    }
}
