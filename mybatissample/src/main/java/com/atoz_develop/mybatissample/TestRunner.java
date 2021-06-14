package com.atoz_develop.mybatissample;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sun.org.slf4j.internal.LoggerFactory;

import ch.qos.logback.classic.Logger;
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
		System.out.println(("DBCP: " + dataSource.getClass())); // ����ϴ� DBCP Ÿ�� Ȯ��
		System.out.println("Url: " + connection.getMetaData().getURL());
		System.out.println("UserName: " + connection.getMetaData().getUserName());
		
		// JdbcTemplate
        jdbcTemplate.execute("INSERT INTO Products (prod_name, prod_price) values ('��Ŷ��', 6900)");
    }
}
