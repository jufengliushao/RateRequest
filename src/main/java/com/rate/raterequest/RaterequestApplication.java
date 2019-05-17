package com.rate.raterequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rate.raterequest.mapper")
public class RaterequestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaterequestApplication.class, args);
    }

}
