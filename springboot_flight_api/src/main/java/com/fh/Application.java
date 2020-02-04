package com.fh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@MapperScan("com.fh.dao")
@EnableRedisRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
