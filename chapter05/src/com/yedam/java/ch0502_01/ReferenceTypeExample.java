package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		
		//✨ 배열 선언 방법
		// 배열을 이루는 타입 지정하고 [] 변수이름;
		int[] intAry = null;
		// 배열은 모든 타입을 값으로 가질 수 있음. boolean, 심지어 배열도 값으로 가질 수 있음
		// int intAry2[]; 도 가능한데 보통 위처럼 씀
//		System.out.println("intAry[0]: " + intAry[0]); // null값을 줬는데 왜 접근하냐... NullPointerException 에러가 남.
		//🍋 배열의 실제 값 찾는 법
		// -> 배열 변수 이름[접근하고자 하는 배열의 인덱스 번호]
		
		// int[] ary = new int[3]; 이라고 크기만 있는 배열을 만들면 
		// 3칸짜리 객체가 생기고, 객체의 번호가 부여되는 것. 생성된 객체 안에 내용은 없음
		// 따라서 값이 없으면 인덱스를 찾고 싶어도 실제 객체에는 값이 없으니까 뭘 할 수가 없음..
		
		//🍋 값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 }; // 배열로 선언했는데 값을 주는 방식은 객체처럼 줌; 머야;
		// 이게 가능한 이유? 자바에서 객체는 위처럼 값 절대 못 줌.
		// 자바에서 저렇게 쓰는 건 객체 개념이 아님
		
		// 이렇게 하면 힙 영역에 83, 90, 87 값을 가진 객체가 생성. 이 객체의 고유 주소를 스택에 연결함.
		// 힙 영역은 개발자가 직접 손 댈 수 있는 영역이 아님!
		// 무조건 스택을 통해서 접근해야함
		// 엄밀히 따지면 스택에 있는 변수는 '객체가 있는 주소' 하나를 값으로 가지는거임
		
		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);
		//🍋 배열의 실제 값 찾는 법
		// -> 배열 변수 이름[접근하고자 하는 배열의 인덱스 번호]
		// 그냥 score만 쓰면 그 배열 안의 모든 값을 가져옴! 당연함. 그 값 전부가 하나의 배열이기 때문		
		
		
			
		
		
		
		
		//🍋 배열은 for문과 궁합이 좋다
		// (인덱스는 정수이고, 무조건 0부터 시작하고, 카운팅은 1씩 증가함) -> 규칙이 있다!
		// for문을 사용하면 배열의 인덱스를 하나씩 꺼내 쓸 수 있음
		// 🍑🍑🍑🍑🍑🍑 배열 크기 정확하게 알 때 🍑🍑🍑🍑🍑🍑
//		int sum = 0;
//		for(int i=0; i<3; i++) { // 주의! 크기가 같다(=)는 빠짐!!! 인덱스와 크기는 항상 1만큼 차이남. 크기와 같아지면 예외가 생김.
//			sum += scores[i];
//		}
//		
		// length를 쓰면 정확한 크기를 몰라도 사용 가능함(length가 배열의 크기를 알고있기때문)
		int sum = 0;
		for(int i=0; i<scores.length; i++) { // 주의! 크기가 같다(=)는 빠짐!!! 인덱스와 크기는 항상 1만큼 차이남. 크기와 같아지면 예외가 생김.
			sum += scores[i];
		}
		
//		for(int i=0; i<=3; i++) { // 주의! =를 붙이면 배열이 가질 수 있는 범위를 벗어났다는 오류가 생김(ArrayIndexOutOfBoundsException)
//			sum += scores[i];
//		}
		
//		// 이렇게 풀어써야 하는 걸, 인덱스가 가지고 있는 정수와 1씩 증가하는 성격을 이용해 반복문으로 쉽게 구함
//		sum += scores[0];
//		sum += scores[1];
//		sum += scores[2];
		
		// 🍑🍑🍑🍑🍑🍑 배열 크기 정확하게 알 때 🍑🍑🍑🍑🍑🍑
//		System.out.println("총합: " + sum);
//		double avg = sum / 3.0; // 소수점까지 정확하게 나오게 하려고 실수(double) 사용
//		System.out.println("평균: " + avg);
		
		// length 사용했을 때
		System.out.println("총합: " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균: " + avg);
		// 		// length가 정수이기 때문에 length를 사용하면 값이 정수임!
		// 하나를 double로 만들어 줘야된다는데.........뭔 말?
		
		
		
		
		
		// 주의사항
		// 변수를 먼저 선언만 하고 나중에 따로 값을 넣어 사용할 수는 없음
		int[] scoreList;
//		scoreList = { 83, 90, 87};
		// 변수를 선언하면서 값을 같이 줄 때는 가능!
		
		// 그래도 따로 쓰고싶은디요..
		// 그럼 new연산자를 사용해야함!
		// new는 생성자를 호출함
		// 기본 타입의 경우 값의 정해진 타입에 따라 스택 영역에 공간 확보만 하면 끝임
		// 객체는 내부에 가지고 있는 필드, 메소드 등 가진게 많음. 이걸 메모리 상에 올려놓으려면 작업이 필요
		// 따라서 생성자(객체를 만들기 위한 것)라는게 따로 있고, 그걸 호출하는 방식이 new 연산자임
		scoreList = new int[] { 83, 90, 87 }; // 지금은 int 배열을 만들 거기 때문에 new, int, 배열, 가질 값 이렇게 쓰면 됨
//		scoreList = new int[5] { 83, 90, 87 };
		// 참고) 값을 정확하게 줄 때는 크기를 줄 수 없음! 내가 준 값을 기준으로 크기가 형성되고, 값이 하나씩 들어가는것
		
		sum = 0; // sum을 0으로 초기화하고 for문 써보자
		for(int i=0; i<3; i++) {
			sum = sum + scoreList[i];
		}
		System.out.println("총합: " + sum);
		
//		sum = add({83, 90, 87}); // 이렇게 쓸 수는 없음
		sum = add(new int[] {83, 90, 87});
		// add에 빨간줄 뜨면 걍 클릭해서 선택해주면 됨
		
		// 배열도 객체임. 객체는 원칙적으로 new연산자를 사용해 이렇게 써야 함!
		// 크기는 주면 안 됨!!
		// but 자바가 예외적으로 변수를 선언하면서 값을 같이 적을 수 있게 해 준 거임. 그래서 선언 따로, 값 따로 걍 줄 수는 없음
		
		
		
		
//		// main 메소드를 벗어나서 다른 메소드 만들거임
//		// 자바에서 함수 만드는 문법
//		int add(int[] numList) { // 리턴하는 타입 함수이름(매개변수){}
//			int sum = 0;
//			for(int i=0; i<numList.length; i++){
//				sum += numList[i];
//			} return sum;
//		}
//		
//		sum = add(new int[] {83, 90, 87});
		// ??????????????
		
		
		
		//🍋 처음에 크기만 주고 나중에 값 넣기
		// new 연산자로 배열 생성
		
		// int 값으로 이루어진 크기가 3인 배열을 만든 것
		int[] array = new int[3]; // 대괄호 안에 만들고자 하는 크기 지정
		for(int i=0; i<3; i++) {
			System.out.println("array["+i+"] : " + array[i]); // 아직 값 넣은거 없음
			// console 실행해보면 내가 넣은 값은 없지만 0으로 출력되는걸 알 수 있음
		}
		
		// 크기만 지정하는 배열을 하면 원래는 비어있어야 하지만, 비어있으면 메모리 할당을 받을 수 없음.
		// 그래서 배열에 뭘 넣냐(타입)에 따라 자동으로 초기값이 지정되어 있음
		// 정수 = 0, 캐릭터 타입은 공백, 실수 = 0.0 등등..
		
		// 배열을 재사용하거나, 외부에서 값이 들어오는 경우는 배열의 크기를 정확하게 모를 수 있음
		// 이 때 length를 사용하면 크기를 알 수 있음(length: 크기를 알 수 있는 변수라고 생각하면 됨. 모든 배열은 크기가 정해져있으니 length를 가지고 있음)

		String[] strAry = new String[4];
		for(int i=0; i<strAry.length; i++) {
			strAry[i] = String.valueOf(i); // 변수에 값을 집어넣고
			// 바로 윗 줄을 주석처리하고 출력해보면 null이 기본값으로 들어있는걸 알 수 있음(String배열의 초기값이 null)
		}
		
		for(int i=0; i<strAry.length; i++) {
			System.out.println("strAry["+i+"] : " + strAry[i]); // 제대로 들어갔는지 확인 출력 해보자
		}
		// 원래는 String이니까 null 값이 출력되어야 하겠지만, 값을 넣었으니 값이 출력됨
		
		
		
		
		
		// 책 p.177 배열
		
		// 배열에 복수의 값이 있으면 반드시 이름이 있어야 함
		// 배열에서는 이 이름을 인덱스라고 정해버린 것. 복수의 값이 들어오면 무조건 인덱스로 이름을 주자.
		// 진짜로 가진 값이 얼마인지는 모르지만, 0, 1, 2, ... 이런식으로 이름(인덱스)을 부르자!
		
		

		/*
		// 참고) 클래스 테스트
		User user = new User(); // User는 class 타입이고, 반드시 new 연산자를 사용해 만들어져야 함
		user.name = "홍길동"; // 값을 각각 개별적으로 줘야 함
		user.age = 25;
		user.height = 175.7;
		// 자바에서는 아래처럼 절대로 값을 줄 수 없음!!
		
		// 자바스크립트에서는 이렇게 객체 형태로 접근해서 값을 줄 수도 있음
//		let user = {
//				name: '홍길동',
//				age: 25,
//				height: 175.7
//		};
		*/
	}

	// 위에서 add 뭐 추가하라한게 이거인듯..? 아닌가??????
	private static int add(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}

}
