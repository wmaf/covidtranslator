package com.carrerdevs.covidtranslator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class CdcCovidData {
    @GetMapping ("/data")
    public Object cdcData(RestTemplate restTemplate) {
        Object requestCdcData = restTemplate.getForObject( "https://data.cdc.gov/resource/vbim-akqf.json", Object.class);
        return requestCdcData;



    }
}

