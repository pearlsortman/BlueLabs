package com.bluelabs.models;

import java.util.List;
import java.util.Objects;

public class County {
    private String name;
    private int fips;
    private List<Election> elections;
    private String party;

    public County() {

    }

    public County(String name, int fips, List<Election> elections, String party) {
        this.name = name;
        this.fips = fips;
        this.elections = elections;
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public List<Election> getElections() {
        return elections;
    }

    public void setElections(List<Election> elections) {
        this.elections = elections;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof County)) return false;
        County county = (County) o;
        return getFips() == county.getFips() &&
                Objects.equals(getName(), county.getName()) &&
                Objects.equals(getElections(), county.getElections()) &&
                Objects.equals(getParty(), county.getParty());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getFips(), getElections(), getParty());
    }
}
