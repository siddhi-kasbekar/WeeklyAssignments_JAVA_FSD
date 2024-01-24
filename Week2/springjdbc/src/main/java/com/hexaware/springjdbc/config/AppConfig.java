package com.hexaware.springjdbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.hexaware.springjdbc.*")
@PropertySource("classpath:resources/database.properties")
public class AppConfig {
	
	@Autowired
	Environment env; // help to read from cache/buffer
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("uname"));
		ds.setPassword(env.getProperty("password"));
		
		return ds;
		
	}

}
