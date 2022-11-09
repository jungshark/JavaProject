package com.yedam.java.ch0602;

public class CarExample {

	public static void main(String[] args) {
		// 클래스를 사용하고 싶다면 인스턴스를 만들어야 함(해당 클래스를 기반으로 하는 인스턴스)
		// 클래스에 직접 접근하는건 웬만해선 없음
		
		Car myCar = new Car();
		
		// myCar가 가진 모든 필드를 불러보자
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model); // 해당 변수. <- 하면 사용할 수 있는 필드(?)들이 쭈루룩 나옴
		// 자바에서 만들어지는 클래스들은 모두 같은 부모를 두고 있음. Object라는 클래스!
		// 어떤 클래스를 만들더라도 그건 Object의 자손 중 하나임
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed); // 값을 주지 않으면 타입에 따라 디폴트 값을 가짐
		
		myCar.speed = 60;
		// 변수.필드 = 정할 값; // 어디에 속한 필드인지 도트연산자를 통해 연결해주면 사용 가능
		System.out.println("수정된 속도: " + myCar.speed);
		
		
		// 새로운 인스턴스 만들기
		Car newCar = new Car();
		System.out.println("새로운 차의 현재속도: " + newCar.speed); // 클래스가 가지고 있는 디폴트 값을 들고있음
		// myCar의 현재 속도와 newCar의 현재 속도는 같지 않음! 공유하고 있는게 아니기 때문에.
		// 같은 설계도를 이용해 두 자동차를 만들었더라도 서로 다른 속도로 달릴 수 있음!
		
		// 변수와 필드의 차이점
		// 변수: 임의의 값. 어떤걸 재사용하기 위해 변수를 생성하고 임시로 값을 담아놓는 것. 언제 사라져도 상관없음
		// 필드: 객체의 필드 = 임시값X. 웬만하면 변하지 않음. 이 클래스(ex. Car)라면 반드시 가지고 있을 성격들(자동차 회사, 모델명, 색깔 등 자동차라면 반드시 가지고 있어야 할 것들) (투명한 차 같은건 없잖아..)
		
		String str = new String("Con"); // 기본 생성자는 아님 기본 생성자는 ()안에 아무것도 없음
		// 기본 생성자가 아닌 또 다른 생성자가 존재..!
		// 생성자는 다양한 형태로 존재할 수 있음. 매개변수(괄호 안에 들어가는 것. 외부의 값을 임시로 받아오는 것)로 하나의 값만 받을수도 있고, 비어있을수도 있고~
		
		// 실제로 Car라는 클래스가 제대로 작동하려면
		// 한 번 만들때마다 제조사, 모델명 등이 달라야한다..! -> 이걸 가능하게 해주는게 생성자
		// ch0602랑 ch0603 패키지 비교해보기
		
		
	}
}
