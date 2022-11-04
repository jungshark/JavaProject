package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// 한 프로젝트 내애서 class 이름은 유니크해야함
		// 컴퓨터가 인식하는 클래스의 실제 이름은 패키지 이름+클래스 이름이기 때문에
		// 패키지가 다르다면 동일한 이름의 클래스를 만들 수 있음 (성이 다르고 이름이 같다고 생각하면 됨)
		// 동일한 프로젝트 내에서는 같은 이름의 클래스 불가능! 만들때부터 오류나서 생성 안 됨
		
		
		// 🍑 기본 타입 🍑		
		
		// byte 타입 (-128~127까지 담을 수 있음)
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
//		//🍋 int라서 byte로는 쓸 수 없다는 에러가 남(byte는 127까지만 있어서 그 뒤는 int(기본으로 얘라고 뜸)라고 인식하기 때문)
//		byte var5 = 128; // 값을 넘어서면 오류남
//		//🍋 타입 에러 남(소수점은 안 되기 때문에)
//		byte var6 = 100.0; // 정수만 가능하기 때문에 소수점 붙여도 오류남
//		// 오류가 났을 때, 에러를 읽을 줄 알아야 함. 오류에 따라 내용이 다름!
		System.out.println(var1);
//		System.out.println(var5);
		
		// int뿐만 아니라 short도 128 가질 수 있는데 오류 나면 왜 int가 아니라서~ 라고 뜰까?
		//🍋 컴파일 할 때 정수값을 디폴트로 인식하는게 int이기 때문. 다른 타입도 인식 가능한 값이지만 오류 메세지에서는 int라고 출력됨.
		short var7 = 128;
		
		long var8 = 128;
//		long var9 = 10000000000; // long타입은 가질 수 있지만 int는 못 가지는 값을 쓰면 int가 아니라는 오류가 뜸
		//🍋 자바에서 정수는 무조건 int라고 인지하도록 정해놨기 때문.
		//🍋 명령어를 실행할 때 값을 먼저 인지, 내가 인지한 값이 잘못됐다고 생각하는 것!(int값이 아닌디..?)
		// 실제 담기는 long까지는 가보지도 못하고 일단 int가 혀용하는 값이 아니니까 오류 띄우는 것.
		long var10 = 1000000000L; // int를 벗어나는 값은 L을 반드시 붙여줘야 함!(소문자도 가능하지만 폰트에 따라 1과 혼동될 수 있기 때문에 보통 대문자 사용)
		long var11 = 1000000; // int 내의 값은 L 안 붙여도 됨(붙여도 상관은 없지만..)
//		short var12 = 1000000;
		// var11이랑 12는 같은 값인데 short는 왜 오류남? 작은 그릇에 담긴 걸 큰 것에 옮기는 건 ㄱㅊ. 근데 큰 걸 작은 그릇에 담을 순 없잖아...?(short는 int보다 값이 허용되는 범위가 작음)

		
		//✨ char 타입
		// '' 사용!
		// 한 글자만 담을 수 있음
		// 유니코드에 있는 값만 받을 수 있음(공백, 두글자 등 X)
		char v1 = 'A'; // '' 홑따옴표를 사용해 문자 쓸 수 있음. "" 쌍따옴표 안 됨!
		char v2 = '가';
		int v3 = v1; // char로 만든 변수를 또 다른 변수 타입에 값을 옮길 수 있음
		System.out.println(v1);
		System.out.println(v2);
		// int에 char 변수 담은걸 출력하니까 숫자가 뜸. 유니코드 값으로 변환시켜 출력되기 때문!
		// 실제 가진 값은 A가 맞지만 출력할 땐 유니코드로 바뀌어 출력됨.
		System.out.println(v3); 
		
		
		//✨ String
		// "" 사용!
		// 공백, 특수문자, 문장 등 전부 인지O
		// 기본 타입은 아님. class인데 일반적인 타입으로 사용 가능
		String name = "홍길동"; // "" 큰따옴표로 감싸줌
		String job = "프로그래머";
		// 유니코드로 변환 안 됨. 다른거임!
		// 내부에 값이 들어 있는 '객체'라고 생각하면 됨
		// '' 문자 리터럴 "" 문자열 리터럴
		System.out.println(name);
		System.out.println(name.length()); // 길이 반환
		System.out.println(job);
		System.out.println(job.charAt(3)); // charAt() : 몇 번째 위치의 값을 원하는지
		// 컴퓨터는 숫자가 0부터 시작. 따라서 인덱스의 위치는 0부터 시작함
		
		
		//✨ char VS String
//		char v4 = "A"; // 글자가 하나든 두개든(공백도 인지) ""를 쓰면 인지 못함 ''를 써야 함!
//		char v5 = 'AB'; // 유니코드 상에 없는 값이기 때문에 오류남
//		char v6 = ''; // 공백도 유니코드에 없음. 오류남
		
		String v5 = ""; // 공백 인지함
		String v6 = "A"; // 한 글자도 인지함
//		String v7 = 'A'; // '' 홑따옴표는 인지 못 함
		String str1 = "누군가 \"안녕\"하면서 인사했다."; // 큰따옴표 시작~끝까지가 하나의 값이라고 받아들임. ""를 내부의 값으로 쓰고 싶을 땐 역슬래쉬\를 붙여 \"(이스케이프 문자)라고 쓰면 됨.

		
		//✨ float
//		float num1 = 3.14; // 3.14는 float이 담을 수 있는데 오류남. why? 자바가 디폴트로 인지하는 실수 타입이 double이기 때문.
		float num2 = 3.14F; // F 붙여야함!! float이 표현할 수 있는 값이더라도 F가 없으면 인지를 못 함.
		double num3 = 3.14; // 같은 값인데 double은 F 안 붙여도 잘 표현됨(double이 디폴트기 때문에)
		
		// 동일한 값이지만 출력하면 다르게 나옴 (표현할 수 있는 ❗정밀도❗가 다르기 때문)
		float varF = 0.1234567890123456789F; // 출력하면 float가 표현할 수 있는 범위에 근접한 값으로 조정되어서 나옴
		double varD = 0.1234567890123456789;
		System.out.println(varF);
		System.out.println(varD);
		
		
		//✨ boolean (논리타입 = True, False 두 가지 값만 있음)
		boolean stop = true;
		if(stop) { // boolean은 if 에 해당 값을 그대로 받아와 이렇게 처리 가능
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		// boolean같은 타입은 표현식을 많이 씀
		boolean stop1 = 1 > 2;
		if(stop1) { // boolean은 if 에 해당 값을 그대로 받아와 이렇게 처리 가능
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}

	}

}
