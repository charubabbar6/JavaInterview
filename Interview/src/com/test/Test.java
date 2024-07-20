package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<>();
		        employeeList.add(new Employee(20,"aaa", "Male",10000.0,"Developer"));
		        employeeList.add(new Employee(30,"bbb", "Male",20000.0,"Tester"));
		        employeeList.add(new Employee(35,"bbb", "FeMale",25000.0,"BAnalyst"));
		        employeeList.add(new Employee(40,"ccc", "Male",30000.0,"Manager"));
		        employeeList.add(new Employee(50,"ddd", "FeMale",40000.0,"QA team"));
		        employeeList.add(new Employee(60,"eee", "Male",50000.0,"Developer"));
		        System.out.println(employeeList);
		        double averageSalary = employeeList.stream()
		                .mapToDouble(Employee::getSalary)
		                .average()
		                .orElse(0.0);
		        System.out.println("Average Salary: " + averageSalary);
		     // Filter employees with age > 30
		        List<Employee> employeesAbove30 = employeeList.stream()
		                .filter(employee -> employee.getAge() > 30)
		                .toList();

		        // Print the details of employees above 30
		        for (Employee employee : employeesAbove30) {
		            System.out.println("Employee age: " + employee.getAge());
					
					  System.out.println("Name: " + employee.getName());
					  System.out.println("Gender: " + employee.getGender());
					  System.out.println("Salary: " + employee.getSalary());
					  System.out.println("Role: " + employee.getRole()); 
					 
		            System.out.println("---");
		        }
		       
		        
	}

}
