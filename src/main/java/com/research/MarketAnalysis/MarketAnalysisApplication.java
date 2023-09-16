package com.research.MarketAnalysis;

import com.research.MarketAnalysis.schedular.ReadCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication

public class MarketAnalysisApplication {



    public static void main(String[] args) {
        SpringApplication.run(MarketAnalysisApplication.class, args);
        //readCsvService.processCsv();
    }

}
