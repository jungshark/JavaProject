package com.yedam.java.ch0604;

public class PhoneExample {

	public static void main(String[] args) { // 클래스를 사용하기 위해서는 main문이 필요
		
		// 클래스명 내가 쓸 객체(?)이름 = new연산자 생성자 
		SmartPhone iphone14Pro = new SmartPhone(); // new연산자: 새로운 객체를 만들기 위해 쓰는 연산자
		// 클래스에서 생성자를 안 만들었는데 어떻게 SmartPhone();를 불러올 수 있을까?
		// -> 자바에서는 생성자가 아무것도 없다면 기본으로 디폴트 생성자를 만들어줌!
		// but, 내가 클래스에 매개변수를 넣은 생성자를 만든다면, 자바가 생성하는 기본 생성자는 사용 불가!
		// 근데 기본 생성자도 쓰고 싶어... -> 클래스에 매개변수 없는 기본 public SmartPhone(){}를 하나 만들어주면 됨.
		
		// .(닷) 연산자 -> 접근연산자 : 클래스에 있는 필드, 메소드 내부로 접근 가능
		iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro"; // 나는 이게 아이폰14프로인줄 알지만 컴퓨터는 글자를 못 읽으니까 모름. 따로 이름 정해줘야함
		iphone14Pro.price = 1000000;
		
		// 위에서 닷 연산자로 정보를 정의해 놓으면, 다음부터는 닷 연산자를 이용해 설정해 둔 데이터를 꺼내와 쓸 수 있음
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + "입니다.");
		System.out.println("나의 핸드폰 기종은 " + iphone14Pro.name + "입니다.");
		
		// 메소드 호출
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		// 하나의 클래스를 잘 만들어놓으면
		// 그 클래스를 재사용해 똑같은 성질(maker, name 등)을 띈 다른 물체들을 수없이 많이 만들 수 있음!
		
		System.out.println("---------------------");
		
		SmartPhone zflip4 = new SmartPhone();
		
		System.out.println(",객체 생성시 생성자에 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name); // 생성자()의 ()에 아무 정보도 안 넣어놨으니, null이 나옴
		
		// 이제 정보를 넣어줌. 이후부터는 주소를 찾아가 name, maker등의 정보를 끄집어내 사용 가능
		zflip4.name = "zflip4";
		zflip4.maker = "samgsung";
		zflip4.price = 1000000;
		
		zflip4.call();
		zflip4.hangUp();
		
		
		
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
		// com.yedam.java.ch0604.SmartPhone@5aaa6d82 이렇게 나올 것!
		// @ 앞의 SmartPhone: 객체를 만들기 위해 쓴 클래스
		// 5aaa6d82: iphone14Pro라는 객체가 담겨있는 주소(위치)
		
		// com.yedam.java.ch0604.SmartPhone@73a28541 z플립은 주소가 다름!!
		// 같은 클래스를 써서 만들었지만 각 객체마다의 주소는 다름
		
		// 힙 영역에 객체를 만들 공간을 할당할 때 써 주는게 new연산자
		// new 다음에 오는 생성자를 통해 정보를 넣어줄 수 있음
		// new - 어떤 메모리에 넣을건지 주소지 등록(집 확보)
		// 생성자() - 그 집에 짐을 기져갈지, 말지 선택하는 것. ()안에 아무것도 없으면 비어있는 것
		

	}
}
