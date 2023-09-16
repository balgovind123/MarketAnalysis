package com.research.MarketAnalysis.controller;

import com.research.MarketAnalysis.model.ReportResponse;
import com.research.MarketAnalysis.schedular.ReadCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report-analysis")
public class ReportController {
    @Autowired
    ReadCsvService readCsvService;

    @GetMapping("/savereport")
    ResponseEntity<ReportResponse> saveReport() {
        readCsvService.processFile();
        return new ResponseEntity("saveRepost", HttpStatus.OK);
    }
}
