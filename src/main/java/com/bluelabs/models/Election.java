package com.bluelabs.models;

import java.util.List;
import java.util.Objects;

public class Election {
    private String party;
    private List<ElectionResult> results;

    public Election(String party, List<ElectionResult> results) {
        this.party = party;
        this.results = results;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<ElectionResult> getResults() {
        return results;
    }

    public void setResults(List<ElectionResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Election)) return false;
        Election election = (Election) o;
        return Objects.equals(getParty(), election.getParty()) &&
                Objects.equals(getResults(), election.getResults());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getParty(), getResults());
    }
}
