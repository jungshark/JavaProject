package com.yedam.java.ch0802;

public class Driver {

	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle에 들어있는 매개변수가 Bus를 참조하고 있는가?
			// new Bus로 만들어진 구현 객체가 맞다!
			Bus bus = (Bus) vehicle; // 그럼 강제 타입 변환하고
			bus.checkFare(); // checkFare 사용해라
		}
		
		vehicle.run();
	}
	
}
