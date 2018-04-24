package com.clairvoyant.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Utility {
	List<Employee> employees = Arrays.asList(
			new Employee("Charles", "Dickens", 60),
			new Employee("Lewis", "Carroll", 42),
			new Employee("Thomas", "Carlyle", 51),
			new Employee("Charlotte", "Bronte", 45),
			new Employee("Matthew", "Arnold", 39)
			);
	
	public List<Employee> getAllInfo() {
		
		return (List)employees.stream().collect(Collectors.toList());
	}
}
