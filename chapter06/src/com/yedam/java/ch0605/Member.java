package com.yedam.java.ch0605;

public class Member {

	// 필드
	private String id;
	private String tel;
	private int age;
	// private는 다른 클래스에서 쓸 수 없음! 어떻게 외부에서 사용 가능하게 만들까?
	// 1. 생성자를 통해 데이터 넣기
	// 2. Getter Setter를 통해 데이터 넣기
	
	
	// Tip!
	// 빈 곳에 커서를 두고 마우스 오른쪽 -> Source -> Generate Getter and Setter를 누르고
	// -> Getter, Setter로 만들고 싶은 필드를 누르면 자동으로 기본 구문을 출력해 줌!!
	
	
	
	// 메소드
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	// private String id;
	// Getter Setter의 기본 구문
	public String getId() {
		// 원본 데이터(yedam)
		// yedam님 입니다. 라고 가공을 해서(꾸며서) yedam이라는 데이터를 다른 곳으로 보내고 싶음
		id += "님 입니다.";
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age <= 0) { // 나이는 0보다 작은게 없으니까
			System.out.println("0보다 작은 나이가 저장되었습니다. 다시 확인하세요");
			return; // 데이터를 저장하지 않음 (저장하면 데이터 무결성이 깨져버림)
		}else {
			this.age = age; // 0보다 큰 값이 들어오면 나이 데이터를 바로 저장
		}
	}
	
	
}
