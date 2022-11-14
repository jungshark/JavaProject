package com.yedam.java.ch1101;

import java.util.Calendar;
import java.util.Date;

public class StringExample2 {
	public static void main(String[] args) {
		
		// 1) 문자열 뒤집기
//		// 1-1. StringBuffer와 reverse 사용
//		String str1 = "abc";
//		
//		StringBuffer re = new StringBuffer(str1);
//		String reverse = re.reverse().toString();
//		
//		System.out.println(re);
//		System.out.println(reverse);
//		
//		
//		// 1-2. StringBuffer 사용
//		String str2 = "ghr";
//		StringBuffer sb = new StringBuffer();
//		sb.append(str2);
//		
//		System.out.println(sb.reverse());
		
		
		// 2. for문 사용, 
		String str3 = "def";
		
		for(int i = str3.length()-1; i>=0; i--) { // 제일 뒤에서부터 시작; 0번까지; i하나씩 빼면서 for문 돌리기
			System.out.print(str3.charAt(i));
		}
		
		
		System.out.println();
		
		
		// 2) 문자열 개수 세기
		// 숫자 48~57
		// 알파벳 65~122
		
		byte[] bytes1 = null;
		String str4 = "1a2v4b";
		bytes1 = str4.getBytes();
		int countNum = 0;
		int countAp = 0;
		
		for(int i=0; i<bytes1.length; i++) {
			if(bytes1[i]>=48 && bytes1[i]<=57) {
				countNum += 1 ;
			}
			if(bytes1[i]>=65 && bytes1[i]<=122) {
				countAp += 1 ;
			}
		}
		System.out.printf("숫자 %d개, 영어 %d개", countNum, countAp);
		
		
		System.out.println();
		
		// 3) 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
//		조건> 금년 기준으로 100년이 넘어간 경우는 제외한다. 또한 생일은 신경쓰지 않는다.
//		(221114 -> 1922년 11월 14일 X, 2022년 11월 14일O)
//		ex) input: 000510, output: 21살
		
		String bd = "000510";
		
		int year = Integer.parseInt(bd.substring(0,2));
		
		int currentYear = 2022;
		
		int manAge = 0;
		
		
		if(year >= 23) { 
			year += 1900;
		}else{
			year += 2000;
		}
		manAge = currentYear - year;
		System.out.println("만나이: " + manAge + "살");
		
		
		
	}
}
