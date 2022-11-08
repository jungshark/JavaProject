package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] dice = null;
		int count = 0;
		int total = 0;
		while(run) {
			
			System.out.println("=== 1.주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 ===");
			System.out.print("메뉴> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			// 1) 주사위 크기: 5~10의 숫자를 입력받고 범위를 벗어날 경우 범위 안내 메세지 출력
			if(selectNo == 1) { // 주사위 크기
				System.out.print("주사위 크기> ");
					dice = new int[6];
					int diceNum = Integer.parseInt(sc.nextLine());	
					dice[count++] = diceNum;
				if(diceNum <= 0 || diceNum > 6) {
					System.out.println("주어진 범위를 벗어났습니다.");
				}
			}else if(selectNo == 2){ // 주사위 굴리기
				int diceNum = 0;
				while(diceNum != 5) {
					diceNum = (int)(Math.random()*6) + 1;
					total += 1;
				}
				System.out.println("5가 나올 때까지 주사위를 " + total + "번 굴렸습니다.");
			}else if(selectNo == 3){ // 결과 보기
				int[] dicelist = new int[6];
				for(int i=0; i<count; i++) {
					int index = dice[i] - 1;
					dicelist[index]++;
				}
				for(int i=0; i<dice.length; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n", i, dicelist[i]);
				}
			}else if(selectNo == 4){ // 가장 많이 나온 수
				
			}else if(selectNo == 5){ // 종료
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("정해진 메뉴 번호(1~5) 내에서 입력하세요.");
			}
		
		}
		

	}

}
