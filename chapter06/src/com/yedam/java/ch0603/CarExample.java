package com.yedam.java.ch0603;

public class CarExample {

	public static void main(String[] args) {
		// 생성자 4개가 제대로 호출되는지 불러보자 (생성자 오버로딩 확인)
		// 생성자 4개를 활용한 다양한 형태의 인스턴스 만들기
		// (생성자 오버레이를 안 쓴다면 아무리 많은 인스턴스를 만들더라도 전부 동일한 인스턴스가 될 것)(현대, 그랜저, 검정을 가진..)
		
		// 1. 디폴트(기본) 생성자
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		// 2. 모델을 넘겨받는 생성자
		Car car2 = new Car("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		// 3. 모델과 컬러를 넘겨받는 생성자
		Car car3 = new Car("회사용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		// 4. 모델, 컬러, 최고속도를 넘겨받는 생성자
		Car car4 = new Car("자가용", "파랑", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println();

	}

}
