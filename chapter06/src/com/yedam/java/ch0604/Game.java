package com.yedam.java.ch0604;

public class Game {
	//✨ 필드 (설계도에서 지칭하는 이름임(완성품 아무것도 만들지 않은 그냥 설계도의 상태!)
	// (객체를 만들면 그 객체의 필드를 가져와 쓰는것이기 때문에 인스턴스 필드라고 이름이 바뀜)
	// 객체를 만들면 거기서 사용하는 필드의 이름이 바뀜
	// 객체로 만든다(인스턴스화가 된다) -> 인스턴스 필드
	
	//✨ 정적 멤버. static 책 p273
	// 메모리 사용 영역 중 '메소드 영역' 에 들어감
	static String gameName = "마인크래프트"; 
	
	// 일반 필드 내용들은 '힙 영역'에 들어감
	String server = "한국"; // 한 가지 정보를 꾸준하게 쓰면서 객체를 여러개 만든다면, 미리 필드에 해당 정보를 넣어서 사용해도 됨!
						  // 그러면 객체 만들때 하나하나 "한국"을 적어 줄 필요가 없으니 간편함.
	String id;
	String passWd;
	
	//✨ 생성자
	// 아무것도 넣지 않으면 이 생성자로 만든 객체는 클래스의 기본 필드 내용을 가짐
	public Game() {
		
	}
	// 생성자는 클래스와 반드시 같은 이름을 써야 함!
	// 원래는 같은 이름인 생성자를 두개 만들 수 없음.
	// 클래스와 같은 이름의 생성자를 여러개 만들면 오류가 나야 정상인데 어떻게 여러개를 만들 수 있을까?
	// -> 생성자 오버로딩
	// 1) 하지만 같은 이름을 가진 생성자라도 뒤에 매개변수 '개수'를 다르게 넣어주면 다른걸로 인식!
	public Game(String id) {
		this.id = id;
	}
	
	// 2) 가져오는 매개변수 개수가 똑같아도 '타입'이 다르면 오버로딩 가능
//	public Game(double passWd) {}
	
	// 매개번수 '개수'가 달라 오버로딩 가능
	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}
	

	//✨ 메소드
	// 객체를 만들면 '인스턴스 메소드' 라고 이름이 바뀜
	void getInfo() {
		System.out.println("Game name: " + gameName);
		System.out.println("id: " + id);
		System.out.println("password: " + passWd);
	}
	
	// 같은 이름을 가진 메소드라도 매개변수에 따라 여러개를 만들 수 있음: 메소드 오버로딩
	void getInfo(String temp) {
		
	}
	
	
}
