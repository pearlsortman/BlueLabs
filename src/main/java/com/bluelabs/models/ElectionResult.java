package com.bluelabs.models;

import java.util.Objects;

public class ElectionResult {
    private String candidate;
    private int votes;

    public ElectionResult(String candidate, int votes) {
        this.candidate = candidate;
        this.votes = votes;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectionResult)) return false;
        ElectionResult that = (ElectionResult) o;
        return votes == that.votes &&
                Objects.equals(candidate, that.candidate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(candidate, votes);
    }
}
