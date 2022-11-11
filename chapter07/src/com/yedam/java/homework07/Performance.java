package com.yedam.java.homework07;

public class Performance extends Culture{

	// 필드
	String genre;
	
	// 생성자
	public Performance(String name, int dirNum, int actNum, String genre) {
		super(name, dirNum, actNum);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println("공연 제목: " + name);
		System.out.println("감독: " + dirNum + "명");
		System.out.println("참여배우 수: " + actNum + "명");
		System.out.println("공연총점: " + total);
		System.out.println("평점: " + getGrade());
	}
	
}
