package com.tianch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.tianch.mapper")
public class TransTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransTestApplication.class, args);
    }

}
