package com;

public class Person {
	
	private int age;
	
	private String name;
	
	private String id;
	
	private String address;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Person(int age, String name, String id, String address) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	

}
