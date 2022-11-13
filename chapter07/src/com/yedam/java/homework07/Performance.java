package com.yedam.java.homework07;

public class Performance extends Culture{

	// 필드
	String genre; // 장르
	
	// 생성자
	public Performance(String name, int dirNum, int actNum, String genre) {
		super(name, dirNum, actNum);
		this.genre = genre;
	}

	
	 // 메소드
	 // 1) 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {
		System.out.println("공연제목: " + name);
		System.out.println("감독: " + dirNum + "명");
		System.out.println("배우: " + actNum + "명");
		System.out.println("공연총점: " + total);
		System.out.println("공연평점: " + getGrade());
	}
	
}
