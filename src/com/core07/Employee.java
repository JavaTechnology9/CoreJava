package com.core07;

import java.util.List;

public class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		List<Employee> list = List.of(new Employee(12, "Emp1"), new Employee(13, "Emp2"), new Employee(14, "Emp3"),
				new Employee(15, "Emp4"), new Employee(16, "Emp5"));
		list.stream().filter(emp -> emp.getId() > 14).forEach(e -> System.out.println(e.getId() + " " + e.getName()));

	}

}
