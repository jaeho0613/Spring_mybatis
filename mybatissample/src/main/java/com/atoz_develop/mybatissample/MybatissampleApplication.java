package com.atoz_develop.mybatissample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = MybatissampleApplication.class)
@SpringBootApplication
public class MybatissampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatissampleApplication.class, args);
	}

}
