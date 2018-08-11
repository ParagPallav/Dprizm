package com.hcl.dprism.controller;

public class User {
	private String Name;
	private int age;
	private String department;

	public User() {

	}

	public User(String name, int age, String department) {
		super();
		this.Name = name;
		this.age = age;
		this.department = department;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
