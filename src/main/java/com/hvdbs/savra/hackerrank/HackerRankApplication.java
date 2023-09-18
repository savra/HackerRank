package com.hvdbs.savra.hackerrank;

import com.hvdbs.savra.hackerrank.statsgenerator.StatsGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackerRankApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackerRankApplication.class, args);
        StatsGenerator.generate();
    }

}
