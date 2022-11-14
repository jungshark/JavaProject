package com.yedam.java.ch1101;

public class Student {
	// 책 p509 3번
	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	
	// 해시코드 3줄로 정의하면 된대.................
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if(studentNum.equals(student.studentNum)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}
