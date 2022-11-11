package com.yedam.java.ch0701;

public class Application {

	public static void main(String[] args) {
		
		Child child = new Child(); // 인스턴스 만들기
		
		// 자식 클래스의 고유 필드 사용
		child.lastName = "paul";
		child.age = 20;
		
		// 부모 클래스 필드 사용하기
		System.out.println(child.firstName + child.lastName);
		// 분명 Child에 firstName을 정의하지 않았음..!
		// 부모 클래스에 있는 firstName을 자식 클래스가 물려받아(상속) 사용하고 있는 것
//		System.out.println(child.job); // private으로 설정된 필드나 메소드는 자식이 상속받아 쓸 수 없다.
		
		// 주의!
		// 부모 -> 여러명의 자식 가질 수 O
		// 자식 -> 여러명의 부모 섬길 수 X
	
		// 상속을 받으면 부모 클래스로부터 필드 뿐만 아니라 메소드도 가져와 쓸 수 있다!
		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
		// 부모 클래스 필드 사용
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		
		// 자식 클래스 필드 사용 (내가 가진 필드)
		System.out.println("채널: " + dmb.channel);
		
		// 부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕하세요.");
		dmb.receiveVoice("안녕하세요 전 김또치입니다.");
		dmb.powerOff();
		
		// 자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		System.out.println("=====================");
		
		Member member = new Member("고길동", "123123-456456", 1);
		// new 연산자 뒤의 생성자를 통해 객체를 만듦\
		// 1. Member 클래스에 있는 생성자로 이동
		// 2. Member 클래스는 People 클래스의 상속을 받음. 이때 People 객체도 같이 만들어줘야 함(부모 생성자를 받아오기 위해)
		// 3. 부모 생성자가 기본 생성자가 아니라 매개변수가 있음! 이럴 땐 super 생성자를 통해 부모 생성자에서 데이터를 넣어준 매개변수들을 호출함.
		// cf. 부모 생성자가 기본 생성자일때는 this로 그냥 바로 받아올 수 있음
		// CellP
		// super라는 명령어를 통해 main문에서 자식 클래스를 만들 때 넣어 준 데이터(고길동 등)를 부모 클래스의 생성자에 넣어줌.
		// 이게 super로 돌아와 this
		
		// 부모 객체의 필드 사용
		System.out.println("name: " + member.name);
		System.out.println("ssn: " + member.ssn);
		
		// 자식 객체의 필드 사용
		System.out.println("memberNo: " + 1);
		
		
		System.out.println("=====================");
		
	
		Child cd = new Child();
		cd.method1();
		cd.method2();
		cd.method3();
		
		Compute com = new Compute();
//		
		double result = com.areaCircle(5); // 부모(Calculator)의 내용을 가져옴
		com.areaCircle(10); // 자식에서 오버라이딩으로 재정의된 걸 가져옴
		
		System.out.println("=====================");
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();
		
		sa.fly(); // 기본은 public int flyMode = NORMAL; 이 상태라 노말이 출력될 것
		
		// 초음속으로 모드 변경
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		// 다시 일반모드로 변경
		sa.flyMode = SupersonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
		
		System.out.println("=====================");
		
		
		//Parent parent = new Child(); 한 줄로 아래 두 줄을 쓸 수도 있음
		Child chd = new Child();
		Parent parent = chd; // 상속받는 부모 타입으로 변환 가능
		// 클래스의 자동 타입 변환 (책 p332)
		// 부모 클래스에 있는 필드, 메소드를 사용하되,
		// 만약 자식 클래스에 오버라이딩 되어 있는 메소드가 존재한다면
		// 부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용하게 됨
		// (부모가 자식의 내용들 중 오버라이딩 된 것만 가져와 쓰는것. 나머지는 자기꺼만 쓰고 ㅎ)
		
		// chd가 아니라 자동타입변환된 parent를 불러와야 함
		parent.method1(); // 자식에게 오버라이딩 되어있음. 오버라이딩 된 게 호출됨.
		parent.method2(); // 부모에게 있는 method2가 호출됨.
//		parent.method3(); // 자식 클래스에 정의되어 있는 메소드라 사용할 수 없음. 오류남
		// 자식의 클래스 타입이라면, method 1~3을 다 불러올 수 있지만
		// 자동 타입 변환을 통해 클래스 타입이 Parent가 됨. 그럼 Parent의 내용만 쓸 수 있음!
		
		
		
	}

}
