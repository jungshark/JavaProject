package com.yedam.java.ch0701;

public class SupersonicAirPlane extends AirPlane{

	// 비행모드. 1은 일반비행, 2는 초음속비행
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 어떤 형태로 날아다니고 있는지 정의
	public int flyMode = NORMAL;

	// 비행 모드에 따라 어떻게 비행하고 있는지를 출력해 줄 메소드
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) { // 초음속 비행일 경우
			System.out.println("초음속 비행 모드입니다.");
		} else { // 일반 비행일 경우
			// 부모 메소드 호출 책 p319 자식 클래스 내부에서 재정의된 부모 클래스 메소드를 호출해야 하는 경우
			super.fly(); // 부모 클래스에 있는 "일반 비행입니다."라고 적힌 fly 메소드를 가져와 사용
			
			// 초음속 비행은 직접 정의해줌(자식 클래스에만 있으니까)
			// 근데 일반 비행에 관련한 내용은 부모 클래스에 정의된 메소드가 있음!
			// 굳이 다시 쓰지 않고 부모 클래스에서 받아오면 편하고 좋음~ (같은 코드 재사용 가능, 중복은 줄임)
			// 여러 개의 자식 클래스에서 사용했는데, 둘 다 직접 "일반 비행입니다." 이렇게 적어준다면, 나중에 수정할 때 직접 다 가서 수정해야 함
			// super.fly(); 를 통해 부모 클래스꺼를 바로 받아온다면, 나중에 부모 클래스에서만 수정을 하면 이걸 쓴 자식 클래스에서도 다 같이 수정됨.
		}
	}
	
	
	public void test() {
		super.fly();
	}
	
	
	
}
