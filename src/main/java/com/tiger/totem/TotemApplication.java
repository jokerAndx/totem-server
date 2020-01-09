package com.tiger.totem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 */
@SpringBootApplication
@MapperScan("com.tiger.totem.mapper")
@EnableCaching
public class TotemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TotemApplication.class, args);
    }

}
