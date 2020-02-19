package com.empact.spring.basion.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarSearch {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	

	public BinarSearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm=sortAlgorithm;
		// TODO Auto-generated constructor stub
	}
	

	public int binarySearch(int[] numbers, int numberToSearchFor) {

	
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);


		return 3;
	}

}
