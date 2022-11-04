package com.yedam.java.ch02homework;

public class HomeworkCh02 {
public static void main(String[] args) {
	/* 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
	   출력예시) "변수명1: 변수값, 변수명2: 변수값" */
	int x;
	int y;
	
	x = 37;
	y = 91;
	
	System.out.println("x: " + x + ", y: " + y);

	
	/* 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
	   2.1) 91 더하기 37
	   2.2) 91 빼기 37
	   2.3) 91 곱하기 37
	   2.4) 91 나누기 37 */
	int add = x + y;
	int sub = x - y;
	int mul = x * y;
	int div = x / y;
	

	/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
	    출력예시) int a = 10; 의 경우 "10, int"로 출력. */
	
//	byte var1 = 128;
	int var1 = 128;
	System.out.printf("%d, %s", var1, "int\n");
	
	
//	char var2 = "B";
	String var2 = "B";
	System.out.printf("%s, %s", var2, "string\n");
	
	
//	String var3 = 44032;
	char var3 = 44032;
	System.out.printf("%s, %s", var3, "char\n");
	
	
//	int var4 = 100000000000;
	long var4 = 100000000000L;
	System.out.printf("%d, %s", var4, "long\n");
	
	
//	float var5 = 43.93106;
	double var5 = 43.93106;
	System.out.printf("%8.5f, %s", var5, "double\n");
	
	
//	long var6 = 301.3;
	float var6 = 301.3F;
	System.out.printf("%5.1f, %s", var6, "float\n");
	
	
	// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
	byte a = 35;
	byte b = 25;
	int c = 463;
	long d = 1000L;
	
	long result1 = a + c + d;
	System.out.println(result1);
	
	int result2 = a + b + c;
	System.out.println(result2);


	double e = 45.31;
	double result3 = c + d + e;
	System.out.println(result3);	
	  
	/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
	    출력예시) A278번지10.0 */
	int intValue1 = 24;
	int intValue2 = 3;
	int intValue3 = 8;
	int intValue4 = 10;
	char charValue = 'A';
	String strValue = "번지";
	
	String str = String.valueOf(charValue) + (intValue1 + intValue2) + String.valueOf(intValue3) + strValue + (double)intValue4;
	System.out.println(str);
	
	
	    
 /* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	    예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
	    힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
	int value = 485;

	int one = value / 100;
	int two = value % 100 / 10;
	int three = value % 100 % 10;
	int sum = one + two + three;
	System.out.println(value + "일 경우" + one + "+" + two + "+" + three + "=" + sum + "으로 결과는" + sum + "입니다.");
	
//	int result = 0;
//	n = length(value)
//	while(n > 0) {
//		result += n % 10;
//		n /= 10;
//	}
//	return result;

}
}
