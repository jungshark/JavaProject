package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		
		// 문제 1) 두 개의 정수가 주어졌을 때
		// 		 두 정수의 합이 자연수이면 'Natural Number'를 출력하는 코드를 작성하세요.
		// (자연수 = 0보다 큰 양의 정수. (음수를 더해도 양의 정수가 되면 됨))
		
		// 정수(실수를 제외한 모든 값을 가질 수 있음)
		// 조건이 정수니까 선언할 때 int로 해 줌. 정수끼리의 합에서 실수는 어차피 못 나오니까 신경 쓸 필요 없음
		int x = -1;
		int y = 8;
		
		if(x + y > 0) {
			System.out.println("Natural Number");
		}
		// 위 문제에는 false일 때의 조건이 없음!
		// 습관적으로 else 쓰지 말고.. 문제에 집중해서 딱 해야 하는 것만 하자
		
		
		// 문제 2) 두 개의 정수가 주어졌을 때
		//		 두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요.
		int a = 3;
		int b = 7;
		// int a, b; (값이 정해져있지 않을 땐 그냥 이렇게 선언만 해 줘도 됨)
		
		if(a > b) {
			System.out.println("a > b");
		}else if(a == b) {
			System.out.println("a = b");
		}else { // 부등호는 3개뿐임. 두개를 위에서 처리했으니 else로 나머지 하나를 처리하면 됨
			System.out.println("a < b");
		}
		
		
		// 문제 3) 체질량 지수인 BMI에 따라 비만도를 네가지 단게로 구분하는 코드 작성
		//		 BMI = 체중(kg) / (키(m) * 키(m))   <- 키의 제곱을 체중으로 나누는 것
		// 		 저체중(18.5미만), 정상(18.5이상 ~ 25미만), 과체중(25이상 ~ 30미만), 비만(30이상)
		
		// 체중과 키는 보통 소수점까지 말하기때문에 double을 사용
		double weight = 55.5; // float를 사용한다면 값 뒤에 f를 붙여줘야 함
		double height = 160.4;
		double BMI = weight / ((height*0.01) * (height*0.01));
		System.out.println(BMI);
		
		// 저체중 -> 비만, 비만 -> 저체중 어떤 방향이든 관계 없음. 순차적으로만 쓰면 됨(근데 정상 if문 주고 그 뒤에 비만 쓰고, 저체중 쓰고, 과체중 쓰고 이렇게는 절대 안 됨)
		if(BMI < 18.5) {
			System.out.println("저체중");
		// 위에서 18.5 미만인건 모두 걸러지기 때문에 굳이 (18.5 <= BMI && BMI < 25) 이렇게 적을 필요 없음
		}else if(BMI < 25) { 
			System.out.println("정상");
		}else if(BMI < 30) { // 25 <= BMI && BMI < 30
			System.out.println("과체중");
		}else { // BMI <= 30
			System.out.println("비만");
		}
		
		
		// 문제 4) 선택한 단의 6번째 값을 출력하는 코드
		//		  예를 들어, 2단일 경우 2 X 6 = 12 가 출력되도록.
		//		  단, 출력문에는 변수를 사용하지 않는다. (출력문에 변수 사용할거면 왜 조건문 쓰냐)
		// (구구단은 보통 정수 이용)
		// 1단부터 시작하고, 9단까지 있으니까 랜덤 수를 아래처럼 작성
		int dan = (int)(Math.random() * 9) + 1;
		
		// 스캐너 사용도 가능! chapter02 -> ch0204 파일 참고
		
		switch(dan) { // dan이 가지고 있는 값을 체크하는 것
		case 1: // dan의 값이 1일때
			// 이 문제에선 출력문에 굳이 변수를 써야 할 필요가 없음
			// System.out.println("1 X 6 = 6"); 이렇게 일일이 적어줘도 되고
			System.out.printf("%d X 6 = %d\n", 1, 1*6); // f문을 사용해 이렇게 적어도 됨
			break;
		case 2:
			System.out.printf("%d X 6 = %d\n", 2, 2*6);
			break;
		case 3:
			System.out.printf("%d X 6 = %d\n", 3, 3*6);
			break;
		case 4:
			System.out.printf("%d X 6 = %d\n", 4, 4*6);
			break;
		case 5:
			System.out.printf("%d X 6 = %d\n", 5, 5*6);
			break;
		case 6:
			System.out.printf("%d X 6 = %d\n", 6, 6*6);
			break;
		case 7:
			System.out.println("7 X 6 = 42");
			break;
		case 8:
			System.out.println("8 X 6 = 48");
			break;
		default: // default는 필수가 아님! 그냥 case 9: 로 적고 이거 빼도 됨
			System.out.println("9 X 6 = 54");
		}

		
		// switch문으로 범위가 있는 문제를 풀어보자
		// 문제 5) 다음과 같이 점수 범위에 따라 등급을 구분하고, 해당 점수에 대한 등급을 출력하는 코드
		//		  90점 이상 ~ 100점 이하: A등급
		//		  80점 이상 ~ 90점 미만: B등급
		//		  70점 이상 ~ 80점 미만: C등급
		//		  60점 이상 ~ 70점 미만: D등급
		//		  60점 미만: E등급
		//		  정수든 실수든 관계없음
		
		// 90, 91, ... , 100 -> 10으로 나눴을 때 몫이 전부 9! + 10은 10
		// 80, 81, ... , 89 -> 몫이 전부 8
		// 70, 71, ... , 79 -> 몫이 전부 7
		// 제한적이긴 하지만 몫을 이용해 switch를 사용할 수 있음
		// if문을 switch문으로 바꾸는건 특정 경우에만 가능(값이 하나로 딱 떨어질 때)
		// switch문 -> if문은 무조건 가능
		
		double score = 65.7;
		double result = score / 10;
		
		// result라고 새 변수 지정 안 하고 계산식을 그대로 담아도 됨
		// switch((int)(score/10)) {} 이렇게!
		switch((int)result) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("E등급");
			
			
		}
		
		
	}

}
