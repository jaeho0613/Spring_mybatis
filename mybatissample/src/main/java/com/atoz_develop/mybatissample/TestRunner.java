package com.atoz_develop.mybatissample;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TestRunner implements ApplicationRunner{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Datasource
		Connection connection = dataSource.getConnection();
		System.out.println(("DBCP: " + dataSource.getClass())); // 사용하는 DBCP 타입 확인
		System.out.println("Url: " + connection.getMetaData().getURL());
		System.out.println("UserName: " + connection.getMetaData().getUserName());
		
		// JdbcTemplate
        jdbcTemplate.execute("INSERT INTO Products (prod_name, prod_price) values ('버킷햇', 6900)");
    }
}
