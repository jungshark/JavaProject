package com.yedam.java.ch1101;

import java.io.UnsupportedEncodingException;

public class StringExample {

	//✨ String에 대해
	
	// String을 쓸 때 a와 c는 같은 주소 참조, new연산자를 사용한 b는 다른 주소를 참조한 게 됨
	// new를 쓰면 새로운 주소를 할당받음
	// String a = "1"; // 100번지
	// String c = "1"; // 100번지
	// String b = new String("1"); // 200번지
	
	public static void main(String[] args) {
		
		// 문제 (책 p486~)
		//🍋 바이트 -> 문자열(String) (디코딩.입축한다)
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// String str2 = new String(바이트 배열 이름, 인덱스 시작점, 가져올 개수);
		String str2 = new String(bytes, 6, 4); // bytes의 6번째 자리부터 4개를 가져와라
		System.out.println(str2);
		
		
		//🍋 String 메소드 (책 p486)
		// 1) charAt(int index) - 특정 '문자' 위치를 반환 (문자열이 아님! 하나만 가능)
		
		String ssn = "123456-1876541";
		// 문자 위치를 반환해 성별 판단하기
		char sex = ssn.charAt(7); // 인덱스 7번을 반환
		
		
		switch(sex) {
		case '1': // 문자열이니까 '' 해줘야함
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		
		//🍋 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";
		
		// == : 주소를 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		// equals : 값을 비교
		if(strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		}else {
			System.out.println("다른 문자열 가짐");
		}
		
		
		//🍋 String -> 바이트 배열로 변환(인코딩. 압축 푼다. 한 글자씩 쪼개기)
		byte[] bytes2 = null;
		String str = "안녕하세요"; // 15개로 쪼개져서 bytes2에 들어갈 것 why? utf-8에서 한글은 한 글자가 3바이트이기 때문
		bytes2 = str.getBytes();
		
		System.out.println(bytes2.length);
		
		
		String str3 = new String(bytes2); // 하나씩 쪼개진 안녕하세요를 가진 bytes2를 String 객체로 만들면, 디코딩해서 하나로 합친 안녕하세요를 str3에 담아줌
		System.out.println("byte2 -> String으로 변환: " + str3);
		
		try {
			byte[] bytes3 = str.getBytes("EUC_KR"); // bytes3이라는 byte배열에 = bytes3을 getBytes로 하나씩 잘라 넣기(EUC_KR 인코딩 타입 사용)
			System.out.println("bytes3.length: " + bytes3.length);
			
			String str4 = new String(bytes3, "EUC_KR"); // "EUC_KR"로 잘랐으니까, "EUC_KR"로 다시 붙여서 복원. str4에 담아줘라
			System.out.println("bytes3 -> string으로 변환: " + str4);
		
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		//🍋 문자열 찾기
		String subject = "자바 프로그래밍";
		
		int index = subject.indexOf("프로그래밍"); // () 안 문자열이 시작하는 곳(프)의 문자열 인덱스 위치를 반환
		
		System.out.println(index);
		
		index = subject.indexOf("a"); // 없는 문자를 적으면
		
		System.out.println(index); // -1을 반환. 이걸 활용해 해당 문자나 문자열이 있는지 없는지를 알 수 있음!
		
		
		//🍋 문자열의 문자 개수 얻기
		System.out.println(subject.length()); // "자바 프로그래밍"의 문자열 개수는 8
		
		
		//🍋 문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java"); // 대체할게(앞의 단어를, 뒤의 단어로)
		// 자바 프로그래밍 -> Java 프로그래밍으로 '자바'는 삭제되고 'Java'로 바뀐 것 처럼 보이지만
		// Java 프로그래밍 이라는 메모리가 따로 만들어 진 것!
		// String으로 A -> AB -> ABC로 바꿨다면, 각각 메모리가 하나씩 따로 만들어 진 것임!!
		System.out.println(newStr);
		
		// oldStr = "자바"; -> 100번지
		// oldStr += "프로그래밍"; -> 200번지
		// oldStr += "재밌다"; -> 300번지
		// 한 메모리 안에서 수정되는게 아니라 각각 다른 메모리로 등록됨! 메모리 낭비 발생
		
		//🍋 Stringbuilder 또는 buffer(임시저장소)
		// 메모리를 잠시 빌려 가공한다. 따로 메모리를 계속 추가하지 않고 한 메모리를 빌려 그 안에서 계속 바뀜
		// 글자 변경을 자주 해야 할 일이 있다면 위의 replace보다는 이 방법 추천!
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		// 위 2줄은 똑같은 기능임~
		
		sb.append("자바"); // 500번지
		sb.append("프로그래밍"); // 500번지
		sb.append("123"); // 500번지
		
		System.out.println(sb);
		
		sb2.append("자바");
		sb2.append("프로그래밍");
		sb2.append("456");
		
		System.out.println(sb2);
		
		
		//🍋 대소문자 바꾸기
		String strVal = "asdfghjkl";
		String strVal2 = "ASDKFJHKL";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		
		//🍋 trim (공백 삭제)
		String strTrim = "   자바   ";
		System.out.println(strTrim); // 양쪽 공백 존재
		System.out.println(strTrim.trim()); // 양쪽 공백 지움
		
		
		//🍋 substring() 문자열 자르기
		// substring(index, end) index부터 end 앞까지 자르기(end 위치는 제외됨)
		// substring(index) index부터 끝까지 자르기
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0, 6); // 0부터 6 앞까지(0~5 잘라옴)
		String secondNum = ssn2.substring(7); // 7부터 끝까지!
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		
		//🍋 split() <- 이건 책에 없는 내용
		// 구분자로 잘라냄. 정규 표현식으로도 가능한데 쌤이 잘 모름 ㅎ
		String strSplit = "1-1-1-1-1-2-3-4-5-6-9";
		
		String[] strAry = strSplit.split("-"); // -를 기준으로 다 잘라서 배열 strAry에 넣어줌
		
		for(String temp : strAry) { // 배열의 첫번째 인덱스를 temp에 넣고 출력, 두번째 인덱스 넣고 출력, 데이터 끝날때까지 반복..~
			System.out.println(temp); // 향상된 for문
		}
		
		
		//🍋 문자열 변환
		// 숫자, 소수, 불리언 -> String으로 변환
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		String strChng = String.valueOf(false);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
	}
}
