package com.bluelabs.services;

import com.bluelabs.models.County;

import java.util.List;

public interface ICountyService {

    List<County> getElectionDataAllCounties();
    List<County> getElectionWinners(String repWinner, String demWinner);
    County getElectionDataByFips(int fips);
}
