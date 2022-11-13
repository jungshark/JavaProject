package com.yedam.java.homework07;

public class Application {
	public static void main(String[] args) {
		
		// 문제 1
		EmpDept empDept = new EmpDept("이지나", 3000, "교육부");
		empDept.getInformation();
		empDept.print();
		
		System.out.println();
		
		
		// 문제 2
		Human human = null;
		
		human = new StandardWeightInfo("홍길동", 168, 45);
		
		human.getInformation();
		
		human = new ObesityInfo("박둘이", 168, 90);
		
		human.getInformation();
		
		System.out.println();
		
		// 문제 3
		Movie movie = new Movie("추격자", 7, 5, "로맨스");
		
		movie.setTotalScore(2);
		movie.setTotalScore(4);
		
		movie.getInformation();
		
		System.out.println("===================");
		
		
		Performance perfo = new Performance("지킬 앤 하이드", 9, 10, "스릴러");
		perfo.setTotalScore(3);
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		
		perfo.getInformation();
		
	}
}
