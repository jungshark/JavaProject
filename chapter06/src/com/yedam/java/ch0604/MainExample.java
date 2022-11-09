package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		// 지금 만든 클래스는 Calculator 메소드에 속해있음(?)
		// 타입선언 새변수이름 = new 클래스선언;
		Calculator myCalc = new Calculator();
		myCalc.powerOn(); // 클래스를 담은 새 변수를 통해 메소드를 호출해주면 됨
		
		myCalc.plus(5, 6); // 값을 줄 때는 타입에 맞게 매개변수를 적어주면 됨!
		// 메소드에는 변수가 있는데, 위 코드처럼 안 담아도 오류가 안 난다? 왜?
		// return타입이 있는 경우 -> 변수에 담아주면 됨. 근데 필수는 아님! 오류는 안 남. 근데 값 담을 곳이 없겠지..?
		// 일단 리턴은 해 줄 건데 니가 값을 담든 말든 상관은 안 할게~
		// 리턴 타입이 있는 경우는 반환하는 타입에 맞춰 변수를 선언해주면 됨
		int sumRes = myCalc.plus(5,  6);
//		double sumRes = myCalc.plus(5,  6);// -> 자동 타입 변환이 가능하기 때문에 double도 가능하긴 함. 근데 굳이?
		System.out.println("sum: " + sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println("divide: " + diviRes);
		
		
		System.out.println("====================");
		
		
		Computer myCom = new Computer();
		// 배열 활용한 메소드 호출하기
		//🍋 배열인 값을 초기화하는 방법 1)
		int[] values1 = {1, 2, 3};// 변수를 선언해서 값을 담고 (값을 몇 개를 담든지 다 ㄱㅊ)
		int intResult1 = myCom.sum1(values1); // 해당 변수를 통째로 넘겨줌
		System.out.println("intResult1: " + intResult1);
		
		// 방법 2) 한 번 쓰고 말 배열이라면 굳이 변수 선언할 필요 없음
		int intResult2 = myCom.sum1(new int[] {1, 2, 3, 4, 5}); // 바로 배열을 선언하고 값도 바로 넘겨주면 됨
		System.out.println("intResult2: " + intResult2);
		
		
		//🍋 도트연산자 활용한 메소드 호출하기
		int intResult3 = myCom.sum2(1, 2, 3);
		System.out.println("intResult3: " + intResult3);
		
		int intResult4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("intResult4: " + intResult4);
		
		
		////
		
		myCalc.execute();
		
		////
		
		// 정사각형 구하기
		double result1 = myCalc.areaRectangle(10);
		
		// 직사각형 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		// 사용자 입장에서는 동일한 메소드를 호출하는 것 같지만 각각 다른 메소드를 가져온 것임
		
		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
		
		
		// 모든 클래스는 내부의 코드를 외부에 노출하지 않음
		// 내부의 코드를 몰라도 메소드의 이름, 시그니처(호출 방식)를 알면 사용에는 문제 없음!
		// 이걸 하기 위해 오버로딩이 생긴 것
		// (println이 어떻게 출력을 하는지 나는 모르잖아... 걍 출력하는거라고 알고 쓰는거 ㅎ)
		
	}
}
