package com.yedam.java.homework07;

public class EmpDept extends Employee{

	// 필드
	String department; // 부서 이름
	
	
	// 생성자
	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	
	public String getDepartment() {
		return department;
	}


	// 메소드
	@Override
	public void getInformation() {
		System.out.println("이름: " + name + "\t연봉: " + salary + "\t부서: " + department);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	

	
}
