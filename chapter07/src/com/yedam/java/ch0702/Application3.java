package com.yedam.java.ch0702;

public class Application3 {
	
	public static void method1(Parent parent) {
		// 내가 쓸 객체(parent) instanceof 비교할 인스턴스 클래스(타입)
		// 내가 쓸 객체가 이 타입인지 아닌지 비교하기 위해 사용
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	
	//2) instanceof를 안 썼을 때 발생하는 오류 보기
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child 변환 성공");
	}
	
	
	public static void main(String[] args) {
		
		// 객체가 무엇을 참조해 만들었는지를 알아야 함!!
		
		// 1. 자동타입변환된 parentA가 
		Parent parentA = new Child(); // parentA는 타입은 Parent라고 볼 수 있겠지만, 참조해서 만든건 Child임..!
		method1(parentA); // 2. 여기에 들어감
		// 3. 그러면 저 위의 parent에 들어감 (parent에 new Child()로 만든 애가 들어간거임)
		// 4. new Child로 만들어진 인스턴스가 Child타입이 맞는지 확인(?) 하고 맞다면 if문을 실행
		
		
//		//2) Parent 자신의 객체로 만들어보자
//		Parent parentB = new Parent(); // Parent자체로 만들어진 parentB. 1> 자동 타입 변환이 안 됨
//		// 2> 캐스팅하려고 위로(2)) 올리니까 변환 안 됐는데 왜 또 변환하려고 하지..? 하고 강제 타입 변환 거절당함
//		// instanceof를 사용하면 이런 오류가 생기는걸 막아줌!
//		method2(parentB);
//		// 3) 타입 변환 오류가 남. 
		
		
		// 매개변수를 통한 다형성 구현
		Driver driver = new Driver();
	
		// bus, taxi -> vehicle을 부모 클래스로 섬김
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// driver.drive(Vehicle vehicle = new Bus()) Bus타입인 새 객체를 부모 타입인 vehicle에 자동 타입 변환한 것
		driver.drive(bus); // (bus)라는 자식클래스인 매개변수가 Driver 클래스의 vehicle 매개변수로 들어감
						   // 그러면 부모 타입으로 만들어진 객체(vehicle)에 자식 객체(bus)가 들어가는 것. 자동 타입 변환에 의해 부모 클래스가 가진 메소드가 아닌, 자식 클래스에서 오버라이딩 된 run()메소드가 실행될 것!
		driver.drive(taxi);
		
		
		
		// 동물이라는 범위가 큰 클래스 하나 생성(부모로 지정)
		Animal animal = null; // 아직 객체가 안 말들어진 상태
		
		// 하나의 객체(여기선 animal)로 다양한 것을 쓸 수 있게 해 주는 것 = 다형성
		
		// 동물이라는 공통점이 있으니 animal을 부모로 상속받게 해 줌
		// 자식 클래스에서 각각 오버라이딩을 해 주고
		// animal이라는 부모 타입에 new Cat()으로 만들어진 자식타입 객체를 넣어줌
		// 부모 타입에도 speak() 라는 메소드가 있지만, Cat에 오버라이딩 된 speak 메소드를 사용할 수 있게 되는 것!
		animal = new Cat();
		
		animal.speak();
		
		animal = new Dog();
		
		animal.speak();
		
		
		
		Parent parent = new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "child";
//		parent.method3();
		
		// 자동 타입 변환을 했기 때문에 자식인 Child 클래스에만 있는 field2, method3()은 사용 불가능!
		// 어떻게 하면 쓸 수 있을까?
		
		// Casting (강제 타입 변환)
		Child child = (Child)parent;
		
		child.field2 = "parent";
		child.method3();
		
		child.field = "parent";
		
		// 기존에 자동 타입 변환으로 쓸 수 있었던 내용에 (부모 클래스 내용 + 오버라이딩 된 자식 클래스 내용)
		// 자식 클래스의 다른 내용들을 추가로 더 쓸 수 있는 것!!
		// 기존에 쓸 수 있었던 거 못쓰는거아님! 다 쓸 수 있음~ 거기에 추가로 못 썼던 자식 클래스 내용을 더 쓸 수 있는 것.
		
		
	
}
}
