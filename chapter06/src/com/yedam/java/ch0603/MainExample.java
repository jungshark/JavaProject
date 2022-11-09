package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		Car myCar = new Car("모닝", "하늘색");
	 // Car라는 클래스 호출, myCar라는 이름 붙여줌 = new를 사용해 생성자 호출(매개변수 2개 값 새로 넣어줌);
		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		// 생성자를 불러오면서, 외부에서 컬러와 모델을 정할 수 있게 해줌
		// 이 모델명과 색깔은 어디에 들어가있을까?
		// 힙 영역에 새롭게 생긴 '인스턴스'의 내용이 변경된거임!
		// 클래스는 여전히 "현대자동차" "그랜저" "검정" 들고있음
		
		
		System.out.println("-----------------");
		
		
		Car newCar = new Car();
		
		System.out.println("제조회사: " + newCar.company);
		System.out.println("모델명: " + newCar.model);
		System.out.println("색깔: " + newCar.color);
		
		// The constructor Car() is undefined 이렇게 에러 뜸
		// 니가 생성하려는 newCar에 쓸 Car라는 기본 생성자가 없다는거임!
		// why? 내가 만든 Car라는 클래스에는 생성자가 있음! -> 생성자가 있는데 자바가 또 기본 생성자를 만들어주진 않음.
		// 개발자가 의도적으로 기본 생성자를 안 넣은건지, 깜빡한건지 자바는 모르기 때문
		// 클래스 어디에도 생성자가 존재하지 않을때만 자바가 기본 생성자를 만들어줌
		// 기본생성자를 사용하고 싶다면, Car클래스에 가서 내가 만든 생성자 외에 따로 기본 생성자를 또 적어주면 됨.
		
		
		System.out.println("-----------------");
		
		// 새로운 인스턴스를 만들면서 값을 줌
		Car subCar = new Car("아이오닉", "하얀색");
		System.out.println("제조회사: " + subCar.company);
		System.out.println("모델명: " + subCar.model);
		System.out.println("색깔: " + subCar.color);
		
		// myCar와 newCar의 출력 결과는 같지 않음.
		
		
		//✨ this
		// this는 클래스를 기반으로 생성된 '인스턴스'가 가진 값을 건드는 것! 클래스의 값을 건드는게 아님
		// -> 새 인스턴스가 생성될 때마다 다른 값을 줄 수 있음
		
		// this는 힙에 있는 '인스턴스'를 가리킴
		// 인스턴스가 생성이 되면 제일 처음엔 Car라는 클래스의 값을 그대로 가져오고,
		// 그 위에 생성자의 this를 통해 새로 설정한 값을 덮어씌우는것!
		// 필드에 같은게 존재하더라도, 생성자 내부{}에 있는게 우선순위가 높음! 그래서 둘을 구분하기 위해 this라는걸 써 주는것도 있음
		
		// 만들어진 자동차에 파란색 색깔을 입히는거랑 설계도 상에서 '파란색'이라고 지정해놓은건 다름!!
		// 만들어진 자동차에 다른 색들을 입히는게 더 다양한걸 만들 수 있음.
		
		
		// 자바에서 똑같은 이름의 메소드는 존재하지 못하는데, (이름이 같으면 누구를 호출하는지 어떻게 앎?)
		// 생성자는 왜 같은 이름으로 계속 호출이 가능할까?
		//✨ 생성자 오버로딩 (책 p238)
		
		// 한 클래스를 기반으로 여러 인스턴스를 만들고싶은데 딱 한 타입만 호출 가능하다면 만들 수 있는 인스턴스에 제약이 걸릴 것.
		// 생성자이름(매개변수) -> 매개변수의 타입, 개수, 순서를 다르게 선언한다면 자바는 이 생성자를 다르다고 인정해 줌!!
		// why? 클래스를 보다 보편화시키고, 외부 값들을 이용해 보다 다양한 인스턴스를 만들기 위함
	}

}
