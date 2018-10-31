package com.seeyoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.seeyoo.mapper")
public class TermianlstatusApplication {

    public static void main(String[] args) {
        SpringApplication.run(TermianlstatusApplication.class, args);
    }
}
