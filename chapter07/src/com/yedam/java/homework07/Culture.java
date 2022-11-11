package com.yedam.java.homework07;

public abstract class Culture {
	// 문제 3 관련
	
	// 필드
	String name; // 영화제목
	int dirNum; // 참여감독 수
	int actNum; // 참여배우 수
	int audNum; // 관객수
	int total; // 총점
	
	// 생성자
	public Culture(String name, int dirNum, int actNum) {
		this.name = name;
		this.dirNum = dirNum;
		this.actNum = actNum;
	}
	
	// 메소드
	// 1) 관객수와 총점을 누적시키는 기능
	// 총점이 얼마 들어오느냐에 따라 관객 수가 동일하게 증가(총점 하나가 들어오면, 관객수+1, 그리고 들어오는 총점들은 계속 추가해서 합으로 만들기)
	public void setTotalScore(int score) {
		audNum = audNum + 1;
		total = total + score;
	}
	
	// 2) 평점을 구하는 기능 (평균 점수, max(100점)가 별 5개, 점수 범위 잡기)
	public String getGrade() {
		int grade = 0;
		grade = total / audNum;
		
		String star = null;
		
		switch(grade) {
		case 1:
			star = "☆";
			break;
		case 2:
			star = "☆☆";
			break;
		case 3:
			star = "☆☆☆";
			break;
		case 4:
			star = "☆☆☆☆";
			break;
		case 5:
			star = "☆☆☆☆☆";
			break;
		} return star;
	}
	
	// 3) 정보를 출력하는 추상 메소드
	public abstract void getInformation();{
	}
	
}
