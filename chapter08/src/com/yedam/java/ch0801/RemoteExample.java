package com.yedam.java.ch0801;

public class RemoteExample {
	public static void main(String[] args) {
		// 인터페이스는 자기 자신을 객체로 가질 수 없음
		// 이렇게 하면 자식 클래스의 오버라이딩 된 메소드를 사용할 수 있음(자동타입변환과 같음)
		
		//1. 인터페이스는 자기 자신을 바로 객체로 만들 수 없음. 따라서 구현 클래스인 TV를 객체로 해서 만듦
		RemoteControl rc = new Television();
		
		//2. 만든 객체를 다른 구현 클래스인 Audio로 덮어씌움(객체가 변경됨(새로 생성되는게X))
		// 그럼 TV가 아니라 Audio에 있는 내용들이 출력될 것
		// 하나의 객체를 만들고 원하는 기능을 가진 자식(구현) 클래스로 갈아끼우면서 재사용 할 수 있음
//		rc = new Audio();
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		// RemoteControl 인터페이스에는 위 기능 3가지밖에 없음. Search의 기능을 쓰고싶다면?
		// 이렇게 Search 인터페이스를 가지고 객체를 하나 새로 만들어야 함
		Search search = new Television();
		
		search.search("google.com");
		
		// 같은 클래스(Television)를 쓰더라도 어떤 인터페이스를 부르냐에 따라 쓸 수 있는 기능이 다름!
		// 이때 구현 클래스(Television)는 내가 불러오고자 하는 인터페이스들을 다 상속받고 있어야 함!
		
		// 클래스가 한 번에 여러 인터페이스를 받을 수 있는 건 좋지만 각각의 기능을 사용하려면 인터페이스를 각각 따로 불러와야 한다는 귀찮음이 있음...
		
		
		
		
		// 어떤 상황에서 많이 쓸까?
		// 쓰기, 읽기, 리스트 조회 기능이 있는 게시판을 만들려고 한다
		// 누구는 write, 누구는 쓰기 이런 식으로 해두면 나중에 뭐가 어떤 기능인지 찾기가 힘들다
		// 공통의 기능을 구현한다면 인터페이스를 통해 서로 같은 메소드 이름을 쓰는게 편함! 메소드 내용은 다 다르게 정의할 수 있음~
		
		
		
		// 근데 이럴거면 걍 이렇게 자식 메소드로 바로 객체를 만들면 되는거 아녀..?
//		Television tv = new Television();
//		
//		tv.turnOn();
//		tv.setVolume(11);
//		tv.turnOff();
		
		
		// 차이가 있음!
		// (이전에 Tire에서 매개변수로 다형성을 한 일이 있었음. 하나의 객체로 다양한 
		
		/*
		인터페이스를 활용한 객체 만들기
		-> 매개변수로 인터페이스를 쓴다면. 하나의 객체로 구현 클래스만 바꿔주면서 여러 기능을 사용할 수 있음
		public void temp(RemoteControl rc){
		}
		 
		 
		클래스를 활용한 객체 만들기
		-> 여러개의 기능을 사용하려면 여러개의 객체를 만들어야 함
		public void temp(Television tv){
		}
		
		public void temp(audio ad){
		}
		
		*/
		
		
		
		// 추상 클래스 vs 인터페이스
		// 사용 용도에 따라 편한걸 선택해서 쓰면 됨
		
		
		// 추상 클래스(extends): 필드, 생성자, 메소드
		// 한 자식은 하나의 부모만 섬길 수 있음
		// 부모 객체 생성 후 자식 객체를 생성해야 함(?)
		
		// 인터페이스(implements): 상수, 추상 메소드
		// 부모/자식 관계가 아님. 하나의 구현 클래스가 있다면 implements뒤에 여러 인터페이스를 받을 수 있음
		// public class Television implements RemoteControl, WashingMachine{}
		// 이런 식으로! (다중 인터페이스 구현. 여러 인터페이스(부모)를 상속받을 수 있다고 보면 됨. 여러 기능을 사용 가능)
		
		// 부모 클래스를 상속받아야 한다면 추상 클래스가 좋고, 
		// 여러 기능을 쓰고싶다! 하면 인터페이스가 훨씬 좋음~
		
	}
}
