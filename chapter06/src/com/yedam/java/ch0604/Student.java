package com.yedam.java.ch0604;

public class Student {
	// 필드
	String stName; // 학생의 이름
	String school;// 학교 이름
	int stNo; // 학번
	int grade; // 학년
	int kor; // 국어, 영어, 수학 성적
	int eng;
	int mat;
	
	
	// 생성자
	// 생성자를 통해서 모든 데이터를 입력
	public Student(String stName, String school, int stNo, int grade, 
			int kor, int eng, int mat) {
		// 매개변수로 stName에 넣어진 불러왔는데, this를 쓰지 않으면 자바는 이게 stName에 해당하는 정보인지, grade인지, 다른건지 모름
		// this를 통해 매개변수가 가져온 정보가 어떤 필드에 해당하는 정보인지 알려줌
		
		// this.내가 클래스에 정의해놓은 필드의 해당 school이라는 곳에 정보를 넣어줌 = 생성자를 통해 매개변수에 담아 가져온 데이터를;
		this.school = school;
		getInfo() ; // 생성자 안에서는 데이터만 가져오는게 아니라 메소드도 불러와 쓸 수 있음
	} // tip! 단어를 클릭해보면 내가 어디서 정보를 받아왔는지(뭐랑 같은 정보인지) 형광펜 칠한것처럼 알려줌
	
	
	// 메소드
	// getInfo() 학생의 내용을 출력할 수 있는 기능
	//🤷‍♀️❔ public은 왜 넣는걸까...?
	public void getInfo() {
		System.out.println("학생이 다니는 학교: " + school);
	}
	
}
