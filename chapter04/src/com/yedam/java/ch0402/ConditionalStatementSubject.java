package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		
		// 문제 1) 책 p161 5번
		// for문을 이용해 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// ******
		
		// 1. 문자열 결합 이용. 새 변수를 선언하는 간단한 방법
		String tree = "";
		for(int i=1; i<=5; i++) {
			tree += "*";
			System.out.println(tree);
		}
		
		// 2. 이중 for문 (변수 사용하지 않고 출력)
		// n번째 줄에 n개의 아스타(*) 출력
		for(int i=1; i<=5; i++) { //바깥 for문은 line
			for(int j=1; j<=i; j++) { // 안쪽 for문은 "*" 출력
				System.out.print("*"); // 한 줄이 아니라 한 글자씩 출력해야하기 때문에 ln을 쓰지 않음
			}
			// 그냥 저대로 출력하면 한 줄에 쫙 붙어서 나옴. 출력이 끝나면 다음 라인으로 넘어가야 하니까 줄바꿈 적어주기
			System.out.println();
		}
		
		
		// 문제 2) for문을 이용해서 1부터 100까지의 정수 중 2의 배수가 아닌 숫자의 개수 구하기
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue;
				}
			count += 1;
			// 아래처럼 해도 됨
			// if(i%2 != 0){
			//		count += 1;
			//		}
		}
		System.out.println("2의 배수가 아닌 숫자의 개수는 " + count + "개입니다.");
		
		// 교수님 풀이
		// for문이 반복되는 동안 살아있어야 하는 변수가 있어야 함. 따라서 for문 바깥에 변수 선언
		int count1 = 0;
		for(int i=1; i<=100; i++) {
//			int count = 0; // 이렇게 안에서 선언하면 count는 한 바퀴 돌아올때마다 계속 0이 됨. 절대 2가 될 수 없음. 반복문을 나갈때마다 사라졌다가 다시 생기는 것(?)
			if(i%2 == 0)
				continue;
			count1++;
		}
		System.out.println(count + "개");
		
	
		// 문제 3) 책 p161 4번
		// 중첩 for문을 이용해 방정식 4x + 5y = 60의 모든 해 중 첫 번째로 구해지는 값을 (x, y) 형태로 출력하기
		// 단, x와 y는 10 이하의 자연수
		Outter: for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println(x + ", " + y);
					break Outter;
				}
			}
		}
		
		// 교수님 풀이
		// 1> 중첩 for문 2> x, y는 1부터 10까지의 정수
		// 중첩 for문을 쓴다는 건 변수가 2개 있다는 것!
		// for문은 무조건 범위가 있어야 함.(1~10 자연수) 아니면 while문 쓰는게 좋음
		
		// 1. 바깥 for문에서 안쪽 for문이 멈춘걸 확인하는 경우
		// 2. 자바에서 제공하는 바깥 for문에 이름 붙이는거 사용 -> 이거 써라~
		Outter: for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				// 4x + 5y = 60 을 만족하면 (x, y)를 프린트하면 됨.
				if(4*x + 5*y == 60) {
					System.out.println(x + ", " + y);
					break Outter;
				}
			}
		}
		
		
		// 문제 4) do-while문과 Math.random() 함수를 이용
		// 		  1~10의 정수 중 7이라는 수가 나올때까지 숫자를 출력
		// 7을 만족하든 만족하지 않든 무조건 한 번은 수가 나와야(random이 한 번은 돌 수 있도록) 함
		int num = 0;
		do {
			num = (int)(Math.random()*10) + 1; // 이 코드 하나로 do문 안에서 계속 반복해서 새로운 수 생성
			System.out.println(num);
		}while(num != 7);
		
		// 아래처럼 하게 되면 random 한 번은 실행이 되지만 무한루프에 빠짐.
		// do 내부에서는 값을 다시 지정해 줄 방법이 없기 때문..!
//		num = (int)(Math.random()*10) + 1;
//		do {
//			System.out.println(num);
//		}while(num != 7);
		
		// while을 이용하면 random을 두번 써야하는 문제가 발생
		int num1 = (int)(Math.random()*10) + 1;
		// while문에 진입하기 위한 random값 1번 필요. num1이 7이 나오면 진입도 못 하고 끝남
		while(num1 != 7) { // while이 7이 아니면 while문 진입 후 랜덤값을 또 한 번 받아와야 함
			num1 = (int)(Math.random()*10) + 1;
		}
		
		
		// 문제 5) 책 161p 3번
		// 		  while문과 Math.random() 햠수를 이용
		//		  2개의 주사위를 던졌을 때, 숫자를 (숫자1, 숫자2)로 출력
		//		  숫자의 합이 5일 경우 종료, 아닌 경우는 계속 주사위를 던짐
		//		  최종으로 주사위를 몇 번 던졌는지 횟수를 출력
		//		  숫자의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)
		
		int dice1 = 0;
		int dice2 = 0;
		int dicesum = 0;
		int total = 0;
		
		while(dicesum != 5) {
			// while문을 돌 때 내부에서 주사위가 굴러가야 하기 때문에 안에서 random값이 새롭게 생성되게 하기
			dice1 = (int)(Math.random()*6) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			dicesum = dice1 + dice2;
			System.out.println(dice1 + ", " + dice2);
			total += 1; // 5가 나올때까지 굴린 횟수 = 반복문 돈 횟수
		}
		System.out.println("주사위를 굴린 횟수는 " + total + "번입니다.");
		// 안에서 print를 하면 매번 출력됨. 마지막 한 번만 출력하면 되니까 while문 안에서 반복되면서 더해진 total값의 최종 버전을 밖에서 출력.
		
		
		// 교수님 풀이
		int total1 = 0; // 카운팅한 값을 넣어줄 변수 선언
		while(true) { // 내부에 변수를 선언할 것이기 때문에 while문은 true로 돌아줘야함
			// 반복할때마다 새롭게 값을 담으면 되기 때문에 내부에 선언하면 됨(값을 누적할 필요가 없기 때문)
			int x = (int)(Math.random()*6) + 1;
			int y = (int)(Math.random()*6) + 1; // 랜덤으로 주사위를 던지고
			total1++; // 던진 횟수 바로 카운팅
			System.out.printf("(%d, %d)\n", x, y); // 던진 주사위 값도 바로 출력
			if(x + y == 5) { // 근데 그 주사위 값의 합이 5라면
				break; // 반복문 탈출! 아니면 다시 while문 돌아가서 랜덤값 출력해 주사위 던지고~
			}
		}
		System.out.println("주사위를 던진 횟수는 총 " + total1 + "번 입니다."); // 카운팅한 최종 값 출력
		
	}

}
