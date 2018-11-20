package com.codercocoon.spring.ioc.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
@Configuration
public class JavaConfiguration {

	@Bean
	public UserService userService() {
		UserServiceImpl bean = new UserServiceImpl();
		bean.setUserDao(userDao());
		return bean;
	}

	@Bean
	public UserDao userDao() {
		UserDaoInMemoryImpl bean = new UserDaoInMemoryImpl();
		return bean;
	}
}
