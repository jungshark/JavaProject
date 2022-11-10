package com.yedam.java.example;

import java.util.Scanner;

public class Application {
	// 배열
	int[] ary = new int[6]; // 숫자를 넣을 수 있는 6개의 방을 가진 int타입 배열
	
	// 배열 진화	
	// class(객체)를 넣을 수 있는 배열. 2차원 배열과 비슷함. 공통적인 분류에 있는 class를 한 묶음으로 만들기 위해 사용.
//	클래스[] ary2 = new 클래스[6]; 
//	Bank[] Bary = new Bank[6];
//	[[new Bank()],[new Bank()],[new Bank()],[new Bank()],[new Bank()],[new Bank()]]

	// 2차원 배열
//	int[][] ary3 = new int[5][5];
//	[ [],[],[],[],[] ]
//	[ [],[],[],[],[] ]
//	[ [],[],[],[],[] ], [ [],[],[],[],[] ], [ [],[],[],[],[] ]
	
	
	
	public static void main(String[] args) {
		
		// 스캐너를 활용해 데이터 받기
		Scanner sc = new Scanner(System.in);
		
		// 스캐너는 두가지가 있음. 둘 다 문자인데 뭐가 다를까?
//		sc.next(); // 123123 엔터 -> 엔터를 포함해 앞의 내용을 다 가져감
//		sc.nextInt();
//		sc.nextLine(); // 123123 엔터 -> 엔터를 기준으로 엔터 앞(엔터 제외)의 내용을 다 가져감
		
		// sc.next(); 를 사용하면
		// 123123은 가져가고
		// 엔터는 콘솔에 남게 됨
		
		// 만약 다음 내용을 sc.nextLine();로 적게 되면, 내용을 가져가기 전에 남아있는 엔터를 가져감;
		// 엔터 앞의 내용을 다 가져가니까 내용이... 없는거임!!
		
		
		
		//✨ 실습 예제
		// 은행 고객 정보를 입력하는 프로그램 만들기
		
		
		// 동적으로 관리하기 위해 Bank라는 배열 크기를 입력받은 회원 수만큼 설정하도록 해보자
		// 1) 회원 수를 입력받아서 배열의 크기 지정
		System.out.println("회원의 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Bank[] Bary = new Bank[count];
		
//		Bank[] Bary = new Bank[2];
		// 6개를 넣을 수 있는 Bank타입의 배열을 만듦
		// 지금 6개의 칸 안에는 아무 데이터도 없음
		
		
		// 데이터(객체)를 넣을 수 있게 반복문 작성
		// 2) 배열 크기 만큼 반복문을 실행. 회원 정보를 객체에 담아서 그 객체를 배열에 저장
		for(int i = 0; i<Bary.length; i++) { // for문을 사용해 각각의 배열에
			
			// 3) new 연산자를 이용해 객체(bank)를 만듦. 지금 만들어진 bank 안에는 아무 데이터도 없음. 빈 깡통임
			//	  반복문을 돌 때마다 새로운 객체를 생성해야 하기 때문에 반복문 안에 적어야 함
			// 만약 for문 밖에 이걸 적는다면, 하나의 객체를 만들고, 그 하나에 반복문 돌 때마다 데이터를 계속 덮어쓰게 되는거임..! 결국 마지막에 적은 데이터만 들어있는 객체가 되는거임.
			Bank bank = new Bank();
			
			// 4-1) 내용 넣기. 계좌번호 입력
			System.out.println("계좌 번호 > ");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account); // 입력받은 account 데이터를 set메소드를 통해 빈 깡통인 bank에 넣어줌
			
			// 4-2) 은행 입력
			System.out.println("은행 입력 > ");
			String bName = sc.nextLine();
			bank.setBank(bName);
			
			// 4-3) 예금액 입력
			System.out.println("금액 설정 > ");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);
			
			// 4-4) 고객 이름 입력
			System.out.println("고객 이름 > ");
			String name = sc.nextLine();
			bank.setName(name);
			
			// 입력을 다 받으면 bank는 꽉 찬 캔이 됨
			
			// 내용이 가득 들어간 bank(객체)를 Bary라는 배열의 방에 하나하나 넣어줌
			Bary[i] = bank; // 위에 코드를 적어 bank 객체에 내용을 넣고, 내용이 담긴 bank 객체를 Bary 배열에 넣어줌
		}
		
		
		for(int i = 0; i<Bary.length; i++) { // Bary의 길이만큼(6번) 반복문 돌릴거임
			Bary[i].getInfo(); // getInfo(): 데이터를 꺼내와서 쓰는 것
		}
		
	}

	

}
