package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.House;

/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public House house() {
		House bean = new House();
		bean.setNumOfBathrooms(2);
		bean.setNumOfBedrooms(3);
		bean.setPrice(50000);
		bean.setAddress("123 Main Street");
		return bean;
	}
}
