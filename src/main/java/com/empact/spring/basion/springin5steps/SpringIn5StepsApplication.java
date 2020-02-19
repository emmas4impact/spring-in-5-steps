package com.empact.spring.basion.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		BinarSearch binarySearch = new BinarSearch(new BubbleSortAlgorthms());
				ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		applicationContext.getBean(BinarSearch.class);
		int result = binarySearch.binarySearch(new int[]{12, 4,6},3);
		System.out.println(result);

	}

}
