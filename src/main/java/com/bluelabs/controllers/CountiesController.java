package com.bluelabs.controllers;

import com.bluelabs.models.County;
import com.bluelabs.services.CountyService;
import com.bluelabs.services.ICountyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountiesController {
    ICountyService countyService = new CountyService();

    @GetMapping(path = "/counties")
    public List<County> getElectionData(@RequestParam(name = "democratic_winner", required = false) String demWinner,
                                        @RequestParam(name = "republican_winner", required = false) String repWinner) {

        if (demWinner != null || repWinner != null) {
            return countyService.getElectionWinners(repWinner, demWinner);
        }

        return countyService.getElectionDataAllCounties();
    }

    @GetMapping(path = "/counties/{fips}")
    public County getElectionDataByFips(@PathVariable int fips) {

        return countyService.getElectionDataByFips(fips);
    }
}
