package com.yedam.java.homework07;

public class Movie extends Culture{
	// 문제 3 관련
	
	// 필드
	String genre;
	
	// 생성자
	public Movie(String name, int dirNum, int actNum, String genre) {
		super(name, dirNum, actNum);
		this.genre = genre;
	}

//	 메소드
//	 1) 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {
		System.out.println("영화 제목: " + name);
		System.out.println("감독: " + dirNum + "명");
		System.out.println("배우: " + actNum + "명");
		System.out.println("영화총점: " + total);
		System.out.println("평점: " + getGrade());
	}
	
	
}
