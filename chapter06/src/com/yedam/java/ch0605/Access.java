package com.yedam.java.ch0605;

import java.util.Scanner;

// 다른 패키지에 있는 class 사용하기 위해 가져오는 방법
// 1. 직접 타이핑해 import 강제 등록
import com.yedam.java.ch0604.Computer;

// 2-2. ctrl + shift + o 로 불러오면 여기 등록됨
import com.yedam.java.ch0604.Game;


//private라고 해도 됨! 근데 그러면 Access에 오류 날 것
// why? private면 어차피 객체 만들 때 불러서 못 쓸 class인데 왜 만드냐고 시비거는 것 ㅋ
public class Access {
	//✨ 패키지 (책 p286)
	
	// import문
	// ctrl + shift + o : import 하는 단축키
	
	// 스캐너를 사용하려면, 이렇게 적어주고 단축키를 사용해 java에 저장된 Scanner 클래스를 불러와서 써야 함
	Scanner sc = new Scanner(System.in);
	
	
	// 2-1. 클래스 안에 생성자를 통해 만들어놓고, ctrl + shift + o로 불러오기
	Game gam = new Game();

	
	
	//✨ 접근 제한자 (책 p293)
	
	// 적용대상 - 모든 속성, 필드, 메소드, 생성자 등 자바의 모든 곳
	// 데이터 타입 앞에 적어주면 됨
	
	//🍋 public: 누구나, 어디서든 접근 가능
	//🍋 private: 내가 속한 클래스 내부에서만 사용 가능
	//🍋 protected: 같은 패키지 내에서 사용 가능, 상속 받은 상태라면(부모-자식간) 패키지가 달라도 사용 가능
	//🍋 default: 같은 패키지 내에서 사용 가능, 패키지가 다르면 사용 불가
	// protected와 default의 차이는 상속 배운 다음에 다시 볼 것~
	
	// 필드
	public String free;
	private String privacy;
	protected String parent;
	String basic;
	
	
	// 생성자
	
	
	// 메소드
	public void free() {
		System.out.println("접근 가능합니다.");
		privacy(); // 다른 메소드 친구를 활용해 private인 메소드를 다른 클래스에서 사용할 수 있게끔 활용할 수 있음
		// free라는 메소드 '내부'에서 privacy라는 메소드가 돌아가는것이기 때문에 가능함
	}
	
	// 밖에서 안 보이게 하고 싶은 정보를 private를 활용해 사용함
	// = 정보은닉, 캡슐화
	private void privacy() {
		System.out.println("접근이 불가능합니다.");
	}
	
	// Application 클래스에서 접근 제한자 사용해봄!
	
}
