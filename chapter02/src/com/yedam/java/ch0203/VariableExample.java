package com.yedam.java.ch0203;

public class VariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		//✨ 자동 타입 변환
		
		
		byte byteValue = 10;
		//🍋 자동 타입 변환의 예외
		// char는 음수가 없기 때문에 char의 허용 범위가 byte보다 좁다고 볼 수 있다.
		// 따라서 byte는 char타입으로 변환 불가능
//		char charValut = byteValue;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue; // char를 int에 담으면 값이 가진 유니코드 숫자를 가져옴
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + intValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		// 이 경우에는 실질적으로 값의 손실이 일어나지는 않음
		
		
		
		//✨ 강제 타입변환
		// 큰 그릇에 있던 걸 작은 그릇으로 옮기면 대부분 데이터 손실이 필연적으로 발생하게 된다.
		// 문제 발생 소지가 많으므로 주의해서 사용할 것!
		// 바꾸려는 작은 허용 범위 타입 = (바꾸려는 작은 허용 범위 타입) 큰 허용 범위 타입
		// 데이터의 손실에 동의한다는 의미로 ()를 사용하고 강제로 타입 변환.
		
		//🍋 유니코드 문자 출력을 위한 숫자를 받았는데 char가 아니라 int로 받은 경우. 타입변환이 필요
		intValue = 44032; // 문자 '가'에 대한 유니코드 값
		// char보다 int의 허용 범위가 더 넓으므로, int 값을 char로 받아오려면 바꾸려는 값이 무엇인지 ()에 표현해줘야 함
		charValue = (char) intValue;  // 이 경우 실질적으로 data 손실은 일어나지 않음.
		System.out.println(charValue);  // char(문자)로 타입을 바꿨기 때문에 유니코드 값이 44032인 '가' 가 출력됨
		
		longValue = 500;
		// 500은 int도 받을 수 있는 값이지만 long의 허용 범위가 int보다 크기 때문에 int로 바꾸려면 강제 타입 변환이 필요함
		intValue = (int) longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);   
		// 결과값이 3.14가 아닌 3으로 출력됨
		// 정수(int)로 타입을 바꿨기 때문에 소수점 값이 손실된 것
		// 실수 -> 정수로 변환하면 어쩔 수 없이 소수점 아래는 사라짐. 실수에서 정수로 값을 변환할 때 주의 필요
		
		
		
		//✨ 정수 타입 연산
		
		
		byte result = 10+20; //🍋 리터럴 끼리는 바로 연산처리 가능. 30으로 출력
		//🍋 연산하려는 값이 변수일때는 문제가 생길 수 있음
		byte x = 10; 
		byte y = 20;
		//🤷‍♀️❔ 자바는 실행 전 한줄 한줄 컴파일하면서 문법적 검사를 진행하기 떄문에 여기서 변수 x, y에 무슨 값이 들어있는지 알 수 없음 (x, y가 뭔지 인식을 못 함)
		// 알 수 없는 값들을 연산처리 할 수 없으니 에러로 표시하는 것 (변수끼리는 연산처리가 안 됨. 문법적 에러)
//		byte result2 = x + y;
		// 해결방법
		int result2 = x + y; // 1) x + y를 int로 인식하기 때문에 result2의 타입을 int로 바꿔주기
		byte result3 = (byte)(x + y); // 캐스팅 괄호를 사용해 강제로 byte타입으로 변환. 잘 안쓰이는 방법
		System.out.println(result2+","+result3);
		
		
		//🍋 문자와 숫자를 더하면 어떻게 될까?
		char charValue1 = 'A'; // A의 유니코드 = 65
		char charValue2 = 1;
		int intResult = charValue1 + charValue2; // 해당 유니코드의 숫자값을 받아와 65 + 1 = 66이 됨
		System.out.println("유니코드 : " + intResult);
		System.out.println("출력문자 : " + (char)intResult);
		// 결과값을 char로 다시 바꾸면 유니코드 66에 맞는 '문자'로 바뀌어서 출력됨!
		// 문자도 유니코드 내의 문자일 경우는 연산이 가능하게 됨. 유니코드 값이 숫자이기 떄문.
		// 일반적인 연산이 아니라 A의 다음 유니코드가 무엇인지 묻는 뜻으로 생각할 수도 있음.
		// int보다 낮은 값은 int로 출력(자바에서는 int가 기본값이기 때문(?))

		byte value1 = 10;
		int value2 = 100;
		long value3 = 100L;
		long longResult = value1 + value2 + value3;
		System.out.println(longResult);
		// long이 하나라도 있으면 long으로 출력되기 때문에 int에 담으려고 하면 오류 발생함
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1; 
		// int plusV1 = intV1 + doubleV1; 는 오류 생김
		// int로 받고 싶다면 int(intV1 + doubleV1) 형태로 사용!
		System.out.println(plusV1);
		// double이 하나라도 있으면 전체가 double인 상태로 계산된 후 double로 출력
		
		
		int intVar1 = 10;
		
		int resultVar1 = intVar1/4; // 원래 결과값은 2.5(double)인데 int로 출력하려고 했으므로 int인 2가 출력!
		System.out.println("10/4의 결과 : " + resultVar1);
		// double을 int로 담게 되면 소수점이 사라짐(int는 정수니까)
		// 결과 : 2 
		
		double resultVar2 = intVar1/4;
		System.out.println("10/4의 결과 : " + resultVar2);
		// 결과 : 2.0
		// 연산 전부터 이미 타입이 int이므로 int끼리의 연산은 정수로 나올 수밖에 없음! 이 연산은 결과값 자체가 2임
		// int값의 연산을 통해 정수로 나온 결과값을 double 타입에 담아봤자 정수에 .0만 붙어서 2.0으로 출력됨
		
		System.out.println("10/4의 결과 : " + (intVar1/4));
		// result : 2
		
		double resultVar3 = intVar1/4.0;
		System.out.println(resultVar1); //🤦‍♀️❌ 2.5가 나와야되는데 왜 2라고 나오지...
		// result : 2.5
		// 결과값이 나온 후에 붙는 타입이랑은 크게 상관없이, 처음 연산할 때 사용되는 값의 타입이 무엇인지가 중요함.
		// 소수점을 결과로 받고 싶으면 계산할때부터 double로 값을 주면 됨.
		
		System.out.println("10/4 결과 :" + resultVar1); 
		System.out.println((double)(intVar1/4.0));
		// 이렇게 둘 중에 하나를 실수형으로 바꿔주고 double로 출력하면 됨!
		//🤦‍♀️❌ 127, 128열은 왜 2.5가 아니라 2가 나올까...ㅎ  .	
		
		
		int x1= 1;
		int y1 = 2;
		double result1 = x1/y1;
		System.out.println("1/2의 결과 :" + result1);
		// result : 0.0
		// 실제로 1/2를 하면 0.5가 나오지만 int는 정수만 받기 때문에 0이라는 결과값이 나옴.
		// 연산 후 나온 결과값 0을 double에 담아봤자 0.0이라고만 표현됨. .5는 이미 연산할 때 담기지 못하고 버려졌기 때문.
		
		int x2=  1;
		int y2 = 2;
		double result10 = (double)x1/y1;
		System.out.println("1/2의 결과 :" + result10);
		// result : 0.5
		// 연산하려는 값(피연산자) 중에 하나를 (double)로 바꾸면 전체가 double로 바뀌어서 연산되기 때문에 소수점까지 살릴 수 있음.
		// 소수값을 포함해 출력이 가능

		
		
		//✨ 문자열 결합
		// +(더하기)연산에서의 문자열 자동타입변환. 책 p82
		
		int value = 10+2+8; // 일반적인 사칙연산의 결과가 출력됨
		System.out.println(value);
		//result 20
		
//		String str1 = 10+2+8;
//		System.out.println(str1); // 에러 발생
		
		// 하나만 문자열로 바꿔도 계산 가능
		// but, 문자열을 어디에 적느냐에 따라 결과값이 완전히 달라짐
		// 숫자 + 숫자는 일반적인 연산을 하지만,
		// 숫자 + 문자 혹은 문자 + 숫자는 문자열로 결합이 발생하기 때문.
		// + 연산자 앞뒤로 하나씩 끊어서 차례차례 계산하면 됨!
		String str2 = 10+2+"8"; // 12 + "8" -> "12" +"8" -> 값 : 128
		System.out.println(str2);
		
		String str3 = 10+"2"+8; // "10" + "2" -> "102" + 8 -> "102" + "8" -> 값 : 1028
		System.out.println(str3);
		
		String str4 = "10"+2+8; // "10" + "2" -> "102" + 8 -> "102" + "8" -> 값 : 1028
		System.out.println(str4);
		
		// ()를 사용해 우선 연산을 주면 그 부분을 먼저 계산함
		String str5 = "10"+(2+8); // "10" + 10 -> "10" + "10" -> 값 : 1010
		System.out.println(str5);

		

		//✨ 기본 타입 <-> String
		
		int aVar = Integer.parseInt("10"); // ""를 벗겨내는데 사용하는 것이 파싱메소드. 이 경우는 안의 값은 숫자여야 함(int니까)
		// 컴파일 할 때는 오류가 안 나지만 실행하면 오류 남. why? 숫자타입이 아닌데 진행하려고 하니까..
		
//		double bVar = Double.parseDouble("a101.0"); // 문자가 껴 있음
//		boolean cVar = Boolean.parseBoolean("5"); // boolean은 true/false밖에 출력을 못 하는데 다른 값이 들어가있음
		
		// 이렇게 바꿔야 함
		// parse를 이용하면 문자열을 기본 타입으로 변환 가능
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);
		
		// 기본값을 문자로 바꾸기 String.valueOf
		// <정석>
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		///문자열로 변환됨!! >> console창에서는 티가 나지않음.
		
		//<편법> 숫자 앞에 문자열로 공백을 넣으면 비슷한 효과를 낼 수 있음
		//문자열로 출력되는데는 문제가 없음
		String strV4= ""+105.23;
		System.out.println(strV4);
		
	}

}
