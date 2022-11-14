package com.yedam.java.ch1101;

public class SystemExample {
	public static void main(String[] args) {
		// 프로그램 종료, 현재 시간 보여주기 등 시스템에 관련된 내용을 보여주는 클래스
		
		//🍋 System.exit() 프로그램 종료
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				System.exit(0);
//			}
//		}
//		System.out.println("프로그램 종료"); // 얘가 안 찍힘!
		// why? if(i == 5)를 만족해 System.exit(0);를 만나면, 바로 프로그램 자체가 종료됨! 걍 완전 종료
		// 웬만하면 쓰지마........~ 위험혀...
		
		
		//🍋 현재 시각 읽기
		long time1 = System.nanoTime(); // 스탑워치 시작 같은거 (이 코드가 적힌 순간의 컴퓨터 시간을 읽어옴)
		// 15:31:xx:xx:xx
		// 시:분:초
		
		int sum = 0;
		for(int i=1; i<=100000; i++) {
			sum += 1;
		}
		
		long time2 = System.nanoTime();
		// 15:32:xx:xx:xx
		
		System.out.println("sum: " + sum);
		System.out.println("계산에 걸린 시간: " + (time2-time1) + "나노초가 소요됨");
		
		
		//🍋 현재 시간 읽어오기
		long time3 = System.currentTimeMillis(); // 값을 가져올 때마다 중복 데이터 없음! 시간은 계속 바뀌고, 이전 시간을 가져올 수 없으니까~)
		System.out.println(time3);
		

	}
}
