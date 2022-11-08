package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 책 p202
		
		// 같은 메뉴를 계속 제공할때는 보통 반복문 사용
		
		// 해당 반복문을 제어하는 변수를 별도로 선언함
		boolean run = true;
		Scanner sc = new Scanner(System.in); // 스캐너는 외부에서 가져오는거기 때문에 이렇게 적고 ctrl + shift + o 를 눌러 import 필수!
				
		int[] scores = null; // 얘는 꼭 필요! 이건 안에 쓰면 안 됨
		// 이 scores의 사용범위는 선언 지점부터 main이 끝나는 지점까지.
		// main이 while을 품고 있기 때문에 while문이 끝나도 scores는 살아남음!
		int studentNum = 0; // 필요하면 변수 선언
		
		// while문은 별도의 조건이 아닌 run이라는 boolean타입 변수를 가질 것. 값이 true니까 true일때 반복문이 계속 돌아갈 것!
		//🍑	 메뉴 만들기
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> "); // 사용자가 입력할 메뉴 번호
			// 사용자가 입력할 번호를 nextLine으로 받아오기
			int selectNo = Integer.parseInt(sc.nextLine()); // 영어는 대소문자가 있기 때문에 보통 메뉴는 숫자를 사용(A적으면 인식되고, a적으면 인식 못 하고 그러면 안되잖아..)

//			int[] scores = null;
			// 내부에 scores변수를 선언하면 안 되는 이유
			// 이렇게 쓰면 java.lang.NullPointerException 에러가 남
			// 변수를 선언하면, 그 변수는 가장 가까운 중괄호 안에서만 사용이 가능함.
			// while문이 끝나면 selectNo와 scores는 사라짐.
			// 반복문이라 다시 재실행되면 내부의 변수도 새롭게 다시 생성되는것!!
			// 1. 학생수를 선택하면 switch case 1로 학생수를 입력받고, break로 while문을 나가게 됨.
			// 그럼 내부 변수들은 다 사라지고, 다시 새롭게 메뉴를 봤을 때 메뉴 번호를 선택하면
			// 그 다음에 int[] scores = null;에 의해 scores 배열은 다시 null 값이 됨.
			// 이렇게 되면 scores에 length가 존재할수가 없음!
			// (scores = new int[studentNum];로 scores의 크기가 학생수만큼 되어야 하는데
			// 메뉴 선택으로 돌아갔을때 null로 다시 리셋되었기 때문.)
			
			// 학생 수를 입력받고 나야 scores를 입력받을 수 있음.
			
			// while문 안에 switch문 사용을 권장하지 않는 이유
						// switch에서 break를 걸면 switch문이 종료되는거지, while문(반복문)이 종료되는게 아님
						// 그리고 while(true){}일 때는 안 되는 것 같음...?
						// switch문을 쓰려면 while의 제어 변수로 boolean 타입이 필요함
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum]; // 학생수를 입력받았으니 학생수만큼 점수를 입력받아야 함
				break;
			case 2:
				// 학생수를 입력받을때는 하나만 입력했지만, 그 학생 수만큼 점수를 입력받을때는 여러개니까 for문으로 반복이 필요
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]>"); // 사용자가 입력하는게 뭔지 알아야하니까 표시되도록
					int score = Integer.parseInt(sc.nextLine()); // 사용자에게 점수를 입력받고
					scores[i] = score; // 그 점수를 scores 배열 안에 넣어주기
				}
				break;
			case 3: 
				// 점수 리스트: 그냥 배열 안의 모든 값을 출력하면 됨
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				// 현재 등록된 점수들 중에서 최고값과 평균을 구함
				int sum = 0; // 평균을 구하려면 총합이 있어야 하니까
				int max = scores[0]; // 최대값 구할때 필요
				for(int i=0; i<scores.length; i++) {
					// 최고점수
					if(max < scores[i]) { // 지금 가진 최고점수(max)보다 scores배열의 i번째 값이 더 크다면
						max = scores[i]; // 기존의 max값에 i번째 값을 대입시킴
					}
					// 총합
					sum += scores[i];
				}
				System.out.println("최고점수: " + max);
				System.out.println("평균: " + ((double)sum / scores.length));
				// sum도 정수고, int배열인 scores도 정수이기 때문에, 하나를 double로 해줘야 결과가 소수점까지 정확하게 나옴
				break;
			case 5: // while문 종료
				run = false;
				break;
			default: // 메뉴 번호 외 다른 숫자(5, 6, ...)를 입력했을 때 보여줄 안내문구
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		
		

	}
}
