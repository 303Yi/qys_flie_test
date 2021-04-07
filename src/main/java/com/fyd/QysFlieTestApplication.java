package com.fyd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fyd.dao")
public class QysFlieTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QysFlieTestApplication.class, args);
    }

}
