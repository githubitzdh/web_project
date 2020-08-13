package com.czxy.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by liangtong.
 */
@SpringBootApplication
//@MapperScan(basePackages = "com.czxy.webdemo.mapper")
public class Web006Application {
    public static void main(String[] args) {
        SpringApplication.run(Web006Application.class,args);
    }
}
