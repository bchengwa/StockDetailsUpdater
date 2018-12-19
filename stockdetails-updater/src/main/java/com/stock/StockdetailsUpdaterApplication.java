package com.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories (basePackages = "com.stock.stockdetails")
@SpringBootApplication
public class StockdetailsUpdaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockdetailsUpdaterApplication.class, args);
	}
}