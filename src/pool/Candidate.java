package pool;


import java.util.Objects;

public class Candidate {
    private final int id;
    private final int votes;

    public Candidate(int id, int votes) {
        this.id = id;
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Candidate{" + "id=" + id + ", votes=" + votes + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return id == candidate.id &&
                votes == candidate.votes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, votes);
    }

}
