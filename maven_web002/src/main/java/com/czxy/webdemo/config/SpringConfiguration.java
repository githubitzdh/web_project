package com.czxy.webdemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@ComponentScan(basePackages="com.czxy.webdemo.service")
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class SpringConfiguration {
	/**
	 * 获得properties文件中内容，并注入对应变量
	 */
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	/**
	 * 配置数据源
	 * @return
	 */
	@Bean
	public DataSource dataSource(){
		DruidDataSource druidDataSource = new DruidDataSource(); 
		druidDataSource.setDriverClassName(driver);
		druidDataSource.setUrl(url);
		druidDataSource.setUsername(username);
		druidDataSource.setPassword(password);
		return druidDataSource;
	}
	/**
	 * 修复spring4.2bug
	 * @return
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	 */

	/**
	 * 事务管理器
	 * @param dataSource
	 * @return
	 */
	@Bean
	public DataSourceTransactionManager txManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}

}
