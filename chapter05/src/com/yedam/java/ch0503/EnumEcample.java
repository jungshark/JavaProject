package com.yedam.java.ch0503;

import java.util.Calendar;

public class EnumEcample {

	public static void main(String[] args) {
		
		Week today = null;
		
		
		Calendar cal = Calendar.getInstance(); // 달력과 관련된 정보를 가진 클래스
		int week = cal.get(Calendar.DAY_OF_WEEK); // 현재 요일 정보 가져옴
		
		switch(week) {
		case 1: // 숫자로 요일에 대한 정보를 받아오고 1이 일요일임~
			today = Week.SUNDAY; // 다시 요일에 대한 정보를 넣어줌
			// 1, 2, 3, ...만 보고는 이게 무슨 요일인지 모르잖아.. 그래서 보기 쉽게 바꿔주는 것
			// 숫자 기반 동작들이 많음(전 세계 공통으로 쓰이는게 숫자이기 때문에)
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
//		if(week == 7) {
//			System.out.println("오늘은 스터디를 갑니다.");
//		}
		// 내가 이 코드만 봤을때 week가 7이라는게 무슨 의미인지 모름.
		// 7이 뭔데...? 무슨 요일인데? 사람마다 토요일인지, 일요일인지 다 달라서 정확하게 알 수가 없음
		
		System.out.println("오늘 요일: " + today);
		
		// enum은 좀 더 명확하게 보여주는 것!
		// 이걸 Week라는 enum에서 SUNDAY라고 한다는걸 알려주면, 일요일이라는걸 정확하게 알 수 있음
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 스터디를 갑니다.");
		} else {
			System.out.println("오늘은 쉬는날");
		}
		
		
		// 책 p212 클래스
		
				// 객체지향이라는건 무슨 말일까?
				// 학생이 1만원을 가지고 있음
				// 학생이 1천원을 주고 지하철을 탐(학생의 남은 돈은 9천원)
				// 지하철은 교통비로 1천원을 받고 지하철 운행을 함
				//(1천원은 사라지지 않음! 지하철의 수익이 +1천원 되는 것)
				// 학생과 지하철의 상호작용임~
				// 객체지향 프로그래밍이란: 서로 주고받으면서 손실 없이 프로그램이 돌아가는 것!

	}
}
