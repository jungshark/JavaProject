package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {

	
	// 외부의 배열 args을 들고와보자
	public static void main(String[] args) {
		// 3. 오른쪽 클릭 하고 run as -> run configuration 클릭
		// Argument 메뉴에서 내가 값을 넣으면 배열에 그 값이 들어감
		// 값 사이에 공백을 넣으면 값이 따로따로 인식됨
		// 값을 하나 넣고 실행하면 오류메세지는 안 뜨지만 아래 if문이 출력됨
		// 값을 두개 넣고 다시 실행해보면 if문 출력x, 오류도 없이 마지막 프린트가 진행됨
		
//		System.out.println("입력값: " + args[0]);
		
	
		// 2. 이걸 적으면
		// 내가 원하는 값이 없어서 종료는 되는데, 왜 종료가 되는지를 알려줌
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// 1. 이렇게 적고 run 하면 ArrayIndexOutOfBoundsException 오류가 뜸
		// string배열 args를 가져오고, 값 두개를 불러오는건 맞음. 문법상 오류는 없음
		// args가 값을 가지고 있는지를 모르기 때문에 실행했을 때 에러가 나는 것

	}
}
