package com.yedam.java.ch0703;

public class Application {
	public static void main(String[] args) {
		
		// 추상 클래스는 직접 자신을 객체화(인스턴스화) 할 수 없다.
//		Phone phone = new Phone("아이폰");
		
		// 추상 클래스를 상속받은 자식은 추상 클래스의 내용을 쓸 수 있음
		// 근데 상속으로도 되는 내용들이라.. 이건 굳이 추상 클래스 만들 필요 없음 ㅎ
		SmartPhone smartPhone = new SmartPhone("고길동");
		
		smartPhone.turnOn();
		
		smartPhone.internetSearch();
		
		smartPhone.turnOff();
		
		
		//✨ 추상 클래스가 가진 특이한 점! 추상 메소드 (책 p362)
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); // 오버라이딩 된 내용이 출력될 것
		cat.sound();
		
		System.out.println("-----------");
		
		// 다형성 활용 (자동 타입 변환 활용)
		
		Animal animal = null; // 아무것도 넣지 않은 Animal 타입의 animal 객체를 만들어줌
		
		animal = new Dog(); // Dog라는 자식 객체를 넣어(참조해)줌으로써 animal을 자동 타입 변환 시켜줌.
		animal.sound(); // Animal에 있는게 아닌 Dog에 있는 오버라이딩 된 sound()가 사용될 것
		
		// 자동 타입 변환에 의해 추상 클래스에 정의된 메소드도 사용할 수 있음
		animal.breath();
		
		animal = new Cat();
		animal.sound();
		
		
		// 매개변수를 활용한 자동 타입 변환 활용
		animalSound(new Dog()); // new Dog()으로 만들어진 객체가 하단의 animal 매개변수에 들어감. animal이 Dog라는 자식 클래스를 가지고 자동 타입 변환을 함.
								// 타입 변환된(?) 자식 클래스에서 오버라이딩 한 sound 메소드가 출력됨. 
		animalSound(new Cat());
		
	}
	
	// 매개변수를 활용한 자동 타입 변환 활용
	public static void animalSound(Animal animal) {
		animal.sound();
	} // animalSound를 부르면 자동 타입 변환에 의해 각각 맞는 sound 메소드가 실행될 것임~
}
