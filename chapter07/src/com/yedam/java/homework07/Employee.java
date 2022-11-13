package com.yedam.java.homework07;

public class Employee {

	// 필드
	String name; // 이름
	int salary; // 연봉
	
	// 생성자
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	
	// 메소드
	public void getInformation() {
		System.out.println("이름: " + name + "\t연봉: " + salary);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
}
