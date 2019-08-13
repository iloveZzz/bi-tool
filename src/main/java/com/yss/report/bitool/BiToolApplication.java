package com.yss.report.bitool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class BiToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiToolApplication.class, args);
    }

}
