package com.shri.billing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@EnableJpaRepositories
public class BillingApplication {

//	@Bean
//	public CommandLineRunner checkBeans(ApplicationContext context) {
//		return args -> {
//			System.out.println("Beans in the application context:");
//			for (String beanName : context.getBeanDefinitionNames()) {
//				System.out.println(beanName);
//			}
//		};
//	}
//
//	@Bean
//	public CommandLineRunner testConnection(DataSource dataSource) {
//		return args -> {
//			try (Connection connection = dataSource.getConnection()) {
//				System.out.println("Connected to the database: " + connection.getCatalog());
//			} catch (SQLException e) {
//				System.out.println("Error connecting to the database: " + e.getMessage());
//			}
//		};
//	}
	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}

}
