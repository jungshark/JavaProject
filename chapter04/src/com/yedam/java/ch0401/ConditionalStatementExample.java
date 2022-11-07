package com.yedam.java.ch0401;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		
		//✨ 기본 IF문
		int score = 90;
		
		// 기본 if문은 true일때만 작동!!! (false일때는 생각하지도 마라 ㅎ)
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} // 자바는 괄호가 매우 중요! 괄호 빼먹지 않았는지 주의하기
		System.out.println("이 문장은 if문과 상관없이 실행됩니다.");
		
		
		// 근데 중괄호를 아예 생략하는것도 문법적으로 허용은 됨
		// but 그러면 if문 바로 다음 한 줄만 if줄이라고 인식. 그 다음줄부터는 if문이라고 생각하지 않는다.
		if(score < 90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
			
		// 중괄호 안 적고 딱 한 줄만 실행하고 싶으면 차라리 이렇게 동급의 줄로 만들어라 (근데 걍 중괄호 써라..)
//		if(score < 90) System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B 입니다.");
			
		
		//✨ IF~ELSE문
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
		System.out.println("이 문장은 if문과 상관없이 실행됩니다.");
		
		
		//✨ IF~ELSE IF~ELSE문
		
		// 중첩 if문으로 사용할수도 있음. but 이렇게 쓰면 코드가 너무 길어지고 쓸데없는 코드가 생길 수 있음.
//		if(score >= 90) {
//			
//		}else {
//			if(score >= 80) {
//				
//			}
//		}
		
		// 그래서 그냥 if~else if~else로 진행하는게 훨씬 나음
		// 🔥🔥 각 if문이 가지는 범위를 잘 봐야함!
		if(score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
			// 위에서 90까지를 잘랐기 때문에 이 else if문이 가질 수 있는 범위는 89부터임.
			// 그냥 80점보다 크다라고 생각하지만 숨은 조건이 있음! 
			// 위에 있는 if문과 연결되기 때문에 최대값이 90 미만이어야 함.
			// 조건이 순차적인지 꼭 확인해야 함. 중간범위 수를 들어낸 상태로 큰 수 -> 작은 수를 구별할 수는 없음
		}else if(score >= 80) { // score < 90 && score >= 80 이라고 생각할 수 있음
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
		}else if(score >= 70) { // score < 80 && score >= 70
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
		}else { // score < 70인 모든 경우
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		//🍋 랜덤한 값 구하기 (책 p139)
		// 자주 쓰임!!! 잘 알아두자
		
		//🍑 주사위를 랜덤으로 굴려보자
		/* 1) Math.random() -> 값이 실수임
		0.0 <= Math.random() < 1.0
		
		2) 정수로 만들려면? .을 뒤로 보내면 됨 (모두 같은 값을 곱하면 결과는 변화없으니까!)
		0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		
		3) 1부터 나온다 해도 소수점이 나올 수 있잖아.. 소수점 어케 날림? 캐스팅 괄호를 이용해 int로 바꾸자
		(int) 0 <= (int)(Math.random() * 10) < (int) 10
		
		4) 주사위는 0이 필요하지 않음. 처음 값이 1이면 된다! 
		(int) 0 + 1 <= (int)(Math.random() * 10) + 1 < (int) 10 + 1
		
		5) 이 식이 랜덤으로 만들 수 있는 값은 아래와 같음
		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		주사위는 6까지만 나오면 되는데....?
		🍋 내가 원하는 값에 대해 start값과 가지고 오고 싶은 개수를(count = 몇개의 숫자 범위인지) 어떻게 뽑아올 수 있을까?
		(int)(Math.random() * count) + start;
		
		가지고 오고 싶은 숫자가 2부터 시작해 3개임
		(int)(Math.random() * 3) + 2;
		*/
		
		//🍑 현재는 주사위(1~6) 값을 가지고 오고 싶음
		// 1부터 시작하고. 주사위에서 나올 수 있는 숫자는 총 6자리임
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
		// 이렇게 적으니까 중복되는 문장이 너무 많음.. else if(num == 숫자) 이거 ㅠ 코드는 간단한게 좋은디...ㅎ
		// 변수가 가지고 있는 값을 이용해 값을 찾을거면 if문보다는 ✨switch문✨이 좋다!!
		// 변수가 조건으로 준 값과 같은지를 물을 때(==) 유용함.
		// switch문은 나오는 값이 딱 정해져 있는 경우에만 사용 가능!
		// 🔥🔥🔥🔥🔥🔥 크다 <, 작다 > 등 범위는 switch문 쓸 수 없음 🔥🔥🔥🔥🔥🔥
		// 변수의 값이 조건의 기준이 되는 경우 switch문이 좋음! 코드가 깔끔해짐. 빠른 파악 가능(직관적임)
		// 변수의 값이 무엇인지에 따라 실행하는 걸 나눌 때 유용. case는 순차적으로 진행됨.
		// if문과 기능상의 차이는 없음
		
		
		//🍑 위 조건문을 switch문으로 바꿔보자
		
		 // 이렇게 시작 (변수에 값을 주면서 시작), 이후 변수의 값을 새로 도출하는 표현식은 없음
		num = (int)(Math.random() * 6) + 1;
		// 내부에 case문을 추가
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default : // 위에 있는 case에 모두 해당하지 않을 경우 실행함
			System.out.println("6번이 나왔습니다.");
		}
		
		
		// break가 없어도 switch문은 동작함(문법적으로 가능은 함)
		// 근데 왜 꼭 case마다 break가 있어야 할까?
		
		//🍋 break문이 없는 case
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		// 만약 9시가 나오면 "회의~"만 나오고 끝나야 하는데 break가 없으면 쭉 내려가서 "업무" "외근"까지 모두 출력하게 됨.
		// 따라서 switch문은 default를 제외한 모든 경우에 break를 넣는다고 생각해라!
		// (default는 무조건 마지막 예외 경우라 break 없어도 됨)
		
		// 그럼 문법적으로 break를 넣도록 해서 없으면 실행이 안 되도록 하는게 좋지 않을까..?
		// 놉.. break가 없는 경우도 존재함! 일부러 break 안 넣는 경우도 있음
		// break를 생략함으로써 두 가지(혹은 여러가지) 경우의 수를 한꺼번에 처리
		
		//🍋 char 타입의 switch문
		// (ex. 대소문자 때문에 일부러 break를 걸지 않는 경우)
		// 쇼핑몰에서 고객을 구분해서 관리함
		// 우수회원 - A등급 / 일반회원 - B / 손님(나머지 경우)
		// char 타입이 가질 수 있는 A는 2개임 (대문자A, 소문자a)
		// 근데 사람은 A와 a를 동일하게 생각. 본인의 습관에 따라 대문자나 소문자를 입력할 것
		
		// 자바가 인식하기엔 2가지 값이지만, 사용자는 하나의 값으로 사용할 때, break를 생략해 두 가지 경우를 한 번에 처리할 수 있음
		// 개발자는 사용자의 이런 경우를 모두 고려해야함.
		
		// switch를 이용하면 case를 2개 연달아 적고, 그 다음에 break를 적어주면 됨
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("우수 회원입니다.");
			break;
			
		/* 이렇게 써도 상관없지만 개발자는 중복을 싫어한다..^^
		case 'A':
			System.out.println("우수 회원입니다.");
			break;
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		*/
		}
			
		
		// String 타입의 switch문
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			
		}
	}
}
