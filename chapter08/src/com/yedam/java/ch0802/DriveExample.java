package com.yedam.java.ch0802;

public class DriveExample {

	public static void main(String[] args) {
		// 매개변수의 다형성 확인
		// 매개변수가 어떤게 들어가냐에 따라 다른 내용이 실행됨
		
		//1) 하나의 구현 객체를 설정해주고
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//2) 그 객체에 다른 매개변수를 넣으면, 각 매개변수에 맞는 구현 클래스가 실행됨
//		driver.drive(bus); // bus 매개변수는 Driver 클래스의 vehicle로 들어김(new Bus()가 vehicle로 간다고 보면 됨). 그럼 bus.run();이 실행되는 것
//		driver.drive(taxi);
		
		Vehicle vhc = new Bus(); // Vehicle의 메소드를 사용하기 위해 Bus 구현 클래스를 사용해 새로운 객체 vhc 생성
		
		vhc.run();
//		vhc.checkFare(); // 오류남.. why? Vehicle의 기능을 오버라이딩 한 내용이 아니기 때문!
		// 자동타입변환으로는 Vehicle의 메소드를 재정의(오버라이딩)한 것만 사용 가능
		
		
		// 강제 타입 변환
		// 이렇게 하면 자식에만 정의된 내용을 사용 가능함
		Bus bus2 = (Bus) vhc;
		// 1. 내가 쓰려는 구현 클래스를 사용한 하나의 구현 객체가 필요함 Vehicle vhc = new Bus();
		// 새 구현 객체 = (사용하려는 구현 클래스) 1로 만든 구현 객체;
		
		bus2.run();
		bus2.checkFare();
		
		// 객체 타입 확인
		// instanceof
		driver.drive(bus); // Driver의 vehicle에 bus가 들어감. if문으로 bus인지 확인하고 -> 맞으니까 if문 실행 -> vehicle.run();도 실행
		driver.drive(taxi); // Driver의 vehicle에 taxi가 들어감. if문으로 bus인지 확인하고 -> bus가 아니니까 if문 바로 종료하고 vehicle.run();으로 택시가 달립니다만 출력
		
		
		
	}

}
