package com.yedam.java.ch1101;

public class Member {
	//✨ 객체동등비교 equals
	
	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;
	

	public Member(String id) {
		this.id = id;
	}

	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) { // Object 밑에 있는 모든게 매개변수가 될 수 있음(걍 다 됨)
		// Object obj = new Member("blue"); -> 자동 타입 변환. 부모 클래스 내용만 쓸 수 있음
		// 이걸 강제 타입 변환을 이용해 자식(Member)이 가지고 있는걸 쓸 수 있게 해줘야 함
		
		// Member로 생성된 객체라면 강제타입변환. 그럼 obj는 Member클래스 내부에 있는걸 쓸 수 있음
		Member member = (Member) obj;
		// Member member = new Member("blue"); (강제타입변환 후)
		
		if(id.equals(member.id)) { // id랑, member.id(Object가 가진 id)를 비교
			// equals = 동등한 객체가 있는지 없는지 비교
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() { // 해시코드는 정수(int)로 나타난다
		// String a = "1";
		// String b = "1";
		// String 타입은 값이 같으면 새 객체를 만들지 않고 있는 주소를 가져와 쓴다
		// = String은 값이 같으면 같은 주소를 참조한다 (책 5-1챕터. p171하단)
		return id.hashCode(); // id는 위에서 String타입으로 해 둠. 주소가 같으면 해시코드가 같은 것으로 나옴
	}
	
	
	// 메인문에서 객체.toString() 을 하면 return 뒤의 내용들이 나오게 될 것
		@Override
		public String toString() {
			return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
					+ ", id7=" + id7 + "]"; // 리턴의 기본 모양은 이렇다(모양 바꿀 수 있음~)
		}
	
}
