package com.yedam.java.ch0604;

public class Calculator {
	//✨ 계산기의 메소드 만들기
	
	//🍋 전원 켜기
	// 전원 켜기는 리턴값이 필요없음 -> void라고 적어줌
	// 매개변수도 필요없음
	// 메소드의 이름은 메소드가 하는 기능에 대해 명확하게 알 수 있도록 정하는게 좋음
	void powerOn() {
		// powerOn이 실행하는 내용
		System.out.println("전원을 켭니다.");
	}
	
	
	//🍋 계산기의 기능 1) 더하기 (plus라는 이름의 메소드를 만들어보자)
	// 내부에서 int 둘을 더한 값을 반환할 것 -> 반환되는 타입은 뭘까? int
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	// 내부에서 처리하는게 아니라 외부로 반환한다는 의미로 return을 꼭 적어줘야 함
	// return이 가질 수 있는 값은 리턴값(여기선 제일 앞의 int)이 결정함!
	// 결과값(result)과 리턴값은 타입이 같아야 함! 다르다면 오류가 남
	
	
	//🍋 2) 나누기
	double divide(int x, int y){ // 매개변수는 0~3개가 적당함. 차라리 class를 넣는것이 낫다!(?)
		double result = (double)x / y;
		return result;
	}
	// 받아오는 x와 y값이 정수라도 나눈 값은 실수가 될 수 있음.
	// 연산식에서 변수 타입을 둘 다 바꾸던가 하나를 바꾸던가 해서 실수로 연산이 발생하고, 결과도 실수로 나오도록 해줘야함
	// 매개변수의 타입과 결과로 리턴되는 값의 타입은 같을 수도 있고 다를 수도 있음!
	
	
	//🍋 전원 끄기
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}	
	

	////
	
	//✨ 메소드는 서로서로 호출해서 사용 가능하다!
	// 메소드는 작게작게.. 최대한 작게 쪼갤 수 있는 만큼 쪼개야 함!
	// 그리고 필요할때 메소드를 불러서 서로 조합하면 됨
	// (가장 기본인 애들을 메소드로 만들고, 얘들을 조합해서 다른 메소드를 만드는 것!)
	// 코드 적을때마다 전부 일일이 적어준다면..?
	// ex) 덧셈 필요한 곳에 전부 덧셈 코드를 하나씩 다 적음(이렇게 하면 중복도 많이 됨).
	// 근데 갑자기 덧셈이 의미하는게 달라져버림.. 그럼 지금까지 덧셈을 쓴 모든 곳을 찾아서 바꿔야 함. ㅁㅊ
	// but, 덧셈에 대한 내용이 한 곳(메소드)에 저장되어 있고, 이 저장된 곳을 가져와 활용해 다른 것들을 만든다면
	// 덧셈 내용이 바뀌어도 덧셈 파일만 찾아 바꾸면 다른 것들도 알아서 다 바뀜!
	
	//🍋 평균 구하기
	// 평균을 구하려면 덧셈이 먼저 필요함
	double avg(int x, int y){
		int sum = plus(x, y); // 덧셈 코드를 직접 쓰지 않고 Calculator 내부에 존재하는 덧셈 메소드를 불러와도 됨
		double result = sum / 2.0; // 평균 구하기
		return result; // 결과 리턴
	}
	
	// 구한 평균 출력(?)
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result); // 실행 결과 출력은 아래에 만든 메소드를 호출해 사용할 것
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	
	//✨ 메소드 오버로딩
	//🍋 사각형의 넓이 구하기
	// 정사각형 -> 가로/세로 중 아무거나 값이 하나 필요, 직사각형 -> 가로세로 값 두개 필요
	
	// 정사각형
	double areaRectangle(double width) {
		return width * width; // 연산 일어나고 -> return이 일어나기 때문에 간단한 연산은 변수 없이 return구문에 바로 처리 가능
	}
	
	// 직사각형
	// 리턴타입 이름(매개변수){} -> 이름은 같아도 아무 상관 없음! 매개변수의 타입, 순서, 개수를 다르게 해 주면 됨
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}
