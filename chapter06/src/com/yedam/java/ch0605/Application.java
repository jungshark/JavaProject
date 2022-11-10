package com.yedam.java.ch0605;

public class Application {
	
	// 필드
	int staticTest = 0;
	
	
	public static void main(String[] args) {
//		staticTest = 1; // Application 안에 바로 필드를 선언하고(static필드 아니고 일반 필드) 가져와서 쓰려고 하면 오류남
		// 그럼 어떻게 하면 될까?
		// 내 자신을 인스턴스로 바꿔서, 그 안에(내 안에) 있는 필드값을 가져와서 써야 함
		Application ap = new Application();
		ap.staticTest = 2;
		
		
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();

		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();
//		csno.word; // csno를 인스턴스화 해서 인스턴스 필드를 만들면 사용 가능
//		csno.words; // 담을 곳이 없어서 오류나는거임
		System.out.println(csno.word); // 어디 담으면 오류 안 남
		System.out.println(csno.words);
		
		
		// 클래스에서 static으로 정의된건 어디서든 가져와 사용 가능!
		// 객체 없이 그냥 불러올 수 있다
		System.out.println(ConstantNo.earthRound);
		
		
		
		// 접근 제한자 사용해보기
		Access access = new Access(); // 같은 패키지 내에 있는 클래스를 사용하여 새 객체 만듦
		
		
		// 1) public
		access.free = "public";
		access.free(); // 메소드 호출
		
		// 2) private
		// 	  privacy를 선언한 클래스가 아닌 다른 클래스에 불러오려고 하니 오류가 남.
//		access.privacy = "privacy";
//		access.privacy(); // 메소드 호출. 오류남
		
		// 3) protected
		access.parent = "parent";
		
		// 4) default
		access.basic = "basic";
		
		
		
		// 싱글톤 사용해보기
		// Singleton타입 객체이름 = 불러올 싱글톤 내용
		Singleton s1 = Singleton.getInstance(); // Singleton s1 = new Singleton(); 이라고 생각할 수 있는것
		Singleton s2 = Singleton.getInstance();
		// 둘은 같음!
		
		// 둘이 진짜 같은지 확인해보자
		System.out.println(s1);
		System.out.println(s2);
		
		// Singleton 타입을 통해 가지고 오면 하나의 객체만 불러와진다고 볼 수 있음!
		
		
		
		// Singleton 클래스를 같이 보면서 이해해보자..
		// singleton == new Singleton()
		// getInstance() == singleton == new Singleton()
		// getInstance() == new Singleton() 라고 할 수 있음!
		
		// p = q이고 q = r이면 p = r이라는 삼단논법(?) 과 동일한 말
		
		Member mem = new Member();
		
		// 1) mem의 인스턴스 필드에 접근 가능한지 확인
		// 2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : " + mem.getTel());
		System.out.println("Age : " + mem.getAge());
		
		
		// Singleton 클래스에 뭔가 오류가 나서 안 열림 ㅅㅂ
	}

}
