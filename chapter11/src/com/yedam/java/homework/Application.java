package com.yedam.java.homework;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// 문제 1)
		// RPGgame 실행
		RPGgame rpg = new RPGgame();
		
		rpg.leftUpButton();
		rpg.RightUpButton();
		rpg.changeMode();
		rpg.RightUpButton();
		rpg.RightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.RightDownButton();
		
		System.out.println("======================");
		
		
		// ArcadeGame 실행
		ArcadeGame ar = new ArcadeGame();
		ar.leftUpButton();
		ar.RightUpButton();
		ar.leftDownButton();
		ar.changeMode();
		ar.RightUpButton();
		ar.leftUpButton();
		ar.RightDownButton();
		
		
		System.out.println();
		
		
		// 문제 2)
		PortableNotebook ptnb = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		ptnb.writeDocumentaion();
		ptnb.watchVideo();
		ptnb.changeMode();
		ptnb.useApp();
		ptnb.searchInternet();
		
		
		System.out.println();
		
		
		// 문제 3)
		// 프로그램을 실행할 경우 50% 확률로 두 개의 게임 중 하나가 셋팅된다
		Keypad game;
		
		int startGame = (int)(Math.random() * 10) + 1;
		if(startGame <= 5) {
			game = new RPGgame();
		}else {
			game = new ArcadeGame();
		}
		
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("=============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("=============================================================================================");
			System.out.print("choice>> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
//			//if~else if~else 사용
//			if(selectNo == 1) {
//				game.leftUpButton();
//			}else if(selectNo == 2) {
//				game.leftDownButton();
//			}else if(selectNo == 3) {
//				game.RightUpButton();
//			}else if(selectNo == 4) {
//				game.RightDownButton();
//			}else if(selectNo == 5) {
//				game.changeMode();
//			}else if(selectNo == 0) {
//				startGame = (int)(Math.random() * 10) + 1;
//				if(startGame <= 5) {
//					game = new RPGgame();
//				}else {
//					game = new ArcadeGame();
//				}
//			}else if(selectNo == 9) {
//				run = false;
//			}else {
//				System.out.println("1~5, 0, 9 중에 하나를 입력해주세요.");
//			}
			
			// switch문 사용
			switch(selectNo) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.RightUpButton();
				break;
			case 4:
				game.RightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				startGame = (int)(Math.random() * 10) + 1;
				if(startGame <= 5) {
					game = new RPGgame();
				}else {
					game = new ArcadeGame();
				}
				break;
			case 9:
				run = false;
				break;
			default:
				System.out.println("1~5, 0, 9 중에 하나를 입력해주세요.");	
			}
	
		}
		
		
		
	}

}
