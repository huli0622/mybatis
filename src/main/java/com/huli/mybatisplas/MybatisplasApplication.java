package com.huli.mybatisplas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.huli.mybatisplas.mapper")
public class MybatisplasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplasApplication.class, args);
    }

}
