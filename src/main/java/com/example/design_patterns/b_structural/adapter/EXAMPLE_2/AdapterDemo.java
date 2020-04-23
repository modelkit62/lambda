package com.example.design_patterns.b_structural.adapter.EXAMPLE_2;

import java.util.List;
import java.util.stream.Collectors;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		System.out.println(employees);

		employees.forEach(System.out::println);
		employees.forEach(s-> System.out.println(s.getFirstName()));
		String collect = employees.stream().map(s -> s.getFirstName()).collect(Collectors.joining(", "));
		System.out.println(collect);
	}
}
