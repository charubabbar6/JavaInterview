package com.test;

import java.time.LocalDate;

class Employee {
    private int age;
    private String name;
    private String gender;
    private double salary;
    private String role;

    // Constructor
    public Employee(int age, String name, String gender, double salary, String role) {
        this.age= age;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.role = role;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

    // Getter and setter methods (not shown here for brevity)
    
    
}