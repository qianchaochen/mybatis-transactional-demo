package com.qcc.study.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qcc.study.springboot.repository")
public class MybatisTransactionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTransactionDemoApplication.class, args);
    }

}
