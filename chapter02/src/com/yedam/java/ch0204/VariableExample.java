package com.yedam.java.ch0204;

import java.util.Scanner; //✨ ctrl + shift + o 해서 이걸 불러와야 Scanner를 쓸 수 있음

public class VariableExample {

	public static void main(String[] args) {
		
		//✨ 포맷을 이용한 printf()
		// 문장을 출력할때는 printf()를 종종 사용
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); // 가지고 있는 값 그대로 출력
		System.out.printf("상품의 가격:%6d원\n", value); // 6자리로 표기하겠다
		System.out.printf("상품의 가격:%-6d원\n", value); // 6자리로 표기하되(자리는 기본으로 들어가야 함!), 오른쪽을 빈 자리로 둔다
		System.out.printf("상품의 가격:%06d원\n", value); // 6자리로 표기하되, 왼쪽을 빈 자리로 둔다
		// println만 자동으로 줄바꿈이 가능! 다른건 적절한 위치에 \n을 사용해야 한다
		
		
		//✨ 소수점
		double area = 3.14159 * 10 * 10;
		System.out.println(area); // println()을 사용. 순수한 값 출력
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); // 두번째에 표현하고자 하는 값을 주면 됨(?)

		
		//✨ 스캐너를 사용해 입력받기
		Scanner sc = new Scanner(System.in); // Scanner: 기본으로 사용하는게 아님. ctrl + shift + o 해서 불러와야 scanner를 쓸 수 있음
		
		/*
		//🍋 nextLine()은 무조건 단독으로 사용해야 함!
		// why? 기준이 다르기 때문. 엔터 치면 인식하는건 같지만
		// nextLine은 엔터까지 읽음(엔터값까지 가져와서 보여주는 것)
		
		//🍋 next()는 엔터를 읽어들이지 않음. 값만 쏙쏙 빼오는 것
		// 읽어서 출력은 했는데, 메모리 상에는 엔터가 남아있음..!
		// nextLine은 메모리 상에 엔터가 있는지를 체크. 근데 next()가 안 가지고 간 엔터가 계속 남아있잖아...
		// 그래서 값이 안 들어와도 엔터만 계속 가지고 가는거임 ㅠ
		 
//		String str = sc.nextLine(); // console창에서 내용을 적고 키보드 엔터치는 순간까지를 한 줄로 읽음
		
		//🍋 한 줄을 통해 두개의 값을 각각 받을 때 사용
		String str2 = sc.next();
		int var = sc.nextInt(); // nextDouble() 등등 타입별로 다 있음
		System.out.println("입력 : " + str2 + "," + var); // 그 쓴 내용을 str에 받아와서 출력함
		*/
		
//		//🍋 nextLine()는 한 줄 한 줄 하나씩 값을 입력해야 함!!!
//		System.out.println("첫번째 : ");
//		String x = sc.nextLine();
//		System.out.println("두번째 : ");
//		String y = sc.nextLine();
//		int result = Integer.parseInt(x) + Integer.parseInt(y);
//		System.out.println("결과 : " + result);
		
		/*
		//🍋 next()는 한 번에 공백을 사용해 입력하면 값을 각각 받아올 수 있음
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("입력 : " + (x+y));
		*/
		
		
		//✨ 반복문✨
		
		// 입력받은 값을 담을 것 하나 만들기
		String inputData;
		
		//🍋 문장 등을 계속 입력해야 할 때, while문으로 반복해서 입력하다가
		// 특정 문자(여기선 exit)를 입력하면 break하고 while문을 빠져나가도록. 문자는 내맘대로 정하면 됨.
		//❕❕ 실습할 때 이렇게 scanner 사용하면 됨
		// 입력값은 대소문자 구분함!
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열:%s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
