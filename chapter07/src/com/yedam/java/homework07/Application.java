package com.yedam.java.homework07;

public class Application {
	public static void main(String[] args) {
		
		Movie movie = new Movie("추격자", 7, 5, "로맨스");
		
		movie.setTotalScore(5);
		movie.setTotalScore(4);
//		movie.getGrade();
		movie.getInformation();
		
		System.out.println("===================");
		
		
		Performance perfo = new Performance("지킬 앤 하이드", 9, 10, "스릴러");
		perfo.setTotalScore(3);
		perfo.setTotalScore(5);
		movie.getInformation();
		
		
	}
}
