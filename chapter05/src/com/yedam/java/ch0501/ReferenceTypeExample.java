package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		
		//✨ null과 NullPointerException
//		String str; // 단순히 이 변수를 쓰겠다고 예약만 한 것. 사용하려면 어떤 값이든 주긴 줘야 함
//		String str = null;
		
		// String은 단순 값(0, 1 등)이 아니라 객체를 줘야 함. 아무 값이나 줄 수는 없음.
		// null은 비어있는 값인데 공간만 배정해 준 것
		
		
		// 메소드를 호출할 때 문제가 생김
		// NullPointerException오류가 생김 = 접근하고자 하는 변수는 어떤 객체도 없다. (동작할 수 있는게 없다)
//		System.out.println("길이: " + str.length());
		
		// 애초에 length()를 호출할 때 문제를 알려줘야 하는거 아닐까...? 그건 문제 없으면서 ㅠ
		// 이유: 자바의 동작 방식 때문. 메소드 영역/힙 영역/스택 영역
		// 스택 영역에 str변수를 만듦. 객체와 연결되진 않았지만 null이라는 값을 들고 있다고 생각하면 됨
		// 자바는 뭘 기준으로 string을 가져올까?
		// 메소드에는 모든 class가 다 들어있음. String, System Math 클래스 등등..
		// 사용자가 스택에 String으로 str이라는 변수를 선언하면[str | null], 자바는 메소드에 있는 String으로 가서 함수, 필드를 확인. 그 안에 있으면 컴파일하면서는 문제가 안 됨(문법상으로는 문제가 안 됨)
		// 컴파일할때는 실제로 어떤 동작을 하는지 알 수 없음(only 문법만 체크!)
		// 그래서 동작시키기 전까지는 빨간 줄이 안 뜸
		
		
		//✨ String(문자열) 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");			
		}
		
		// 두 개의 변수에 '신미철'이라는 값을 각각 넣음
		// 힙 타입에는 신미철이라는 값을 가진 객체가 있음. 
		// 스택에 있는 strVar1과 strVar2는 같은 객체를 공유하고 있는 것
		// 같은 객체의 주소를 가져와 사용.
		// 각각 값을 하나씩 지정한게 아니라 '신미철'이라는 값을 가진 한 객체의 주소를 각각 불러오는 것!
		// int는 각각 값을 가지지만(?) int1 = 0; int2 = 1;
		// String은 좀 다름!
		// 사용자가 홍길동이라는 값을 적었을 때,
		// 자바는 힙 타입에서 홍길동을 쫙 찾음.
		// 홍길동이라는 값을 들고 있는 객체가 있을 경우, 해당 객체의 주소를 스택에 반환.
		// 홍길동 값을 들고 있는 객체가 없으면 새로운 객체를 만들어버림
		
		
		// 객체가 가지고 있는 값을 비교하는 법
		if(strVar1.equals(strVar2)) { // 이게 같아야만 진짜로 두 변수의 값이 같다고 할 수 있음
			System.out.println("strVar1과 strVar2가 문자열이 같음");
		}
		
		System.out.println("---------------------");
		
		// 원래 객체타입은 ""로 값을 주지 않아..
		// 객체타입이 값을 가지는 정석 방법: new연산자를 사용
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미철");
		
		if(strVar3 == strVar4) { 
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		// var1,2와 var3,4는 값을 준 방법만 다를 뿐, 준 값은 똑같음.
		// 근데 왜 참조 결과는 다르게 나올까?
		
		// var3, 4는 참조가 다르지만 문자열은 같다고 나온다.
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		// String이 독특한 것임! (String은 참조 타입)
		// 원래 참조타입은 new 연산자를 사용해 새로운 객체를 매번 선언함.
		// 이미 같은 값을 가진 객체가 있든 없든 그건 관계X, 나만을 위한 객체를 새로 만듦
		// 이때 등호(==)가 실행되면, 스택 영역에서 각 변수가 실제로 가진 객체의 번지값을 비교함.(객체 안의 값을 비교하는게 아님)
		// 결과가 false라면 -> 다른 객체를 참조하고 있는 것
		
		// int와 같은 기본 타입은 값 자체가 스택에 있어서 그 자체로 비교함!
		// 참조 타입이 어떻다~ 여기에 기본 타입들은 아무런 해당이 안 되니까 생각하지 마라 ㅎ
		
		// 내가 운전면허증을 들고 있든 민증을 들고 있든 그게 내 주민번호라면 다 같은 나 아님?
		// 내가 2명은 아니잖아...... 담긴 틀(객체)은 달라도 들고 있는 고유의 값은 같다!
		// equals는 객체가 달라도 관계없음! 그 객체가 가진 값을 기준으로 비교하는 것.
		// 값을 들고 있는 객체가 달라서 등호(==)로는 false가 나오더리도
		// 각각의 객체 안에 가진 값이 같다면 equals로는 true가 나옴
		
		
	}

}
