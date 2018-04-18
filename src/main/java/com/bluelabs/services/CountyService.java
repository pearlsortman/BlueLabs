package com.bluelabs.services;

import com.bluelabs.models.County;

import java.util.ArrayList;
import java.util.List;

public class CountyService implements ICountyService {
    public List<County> getElectionDataAllCounties() {
        List<County> resultsList = new ArrayList<>();

        return resultsList;
    }

    public List<County> getElectionWinners(String repWinner, String demWinner) {
        List<County> resultsList = new ArrayList<>();

        return resultsList;
    }

    public County getElectionDataByFips(int fips) {
        return new County();
    }
}
