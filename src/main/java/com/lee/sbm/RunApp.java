package com.lee.sbm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.lee.sbm.dao")
public class RunApp extends SpringBootServletInitializer {
public static void main(String[] args) {
	 SpringApplication.run(RunApp.class,args);
}
}
