package com.yedam.java.ch1101;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException  {
		// 클래스의 정보를 가져올 때 쓰는게 Class (책 p482)
		
		// Key 클래스 객체 정보 가져오기
		// 방법 1) 직접 클래스 객체 가져오기
		Class clazz = Key.class; // 변수로 class는 쓸 수 없음..ㅎㅎ
		
		System.out.println(clazz);
		
		
		// 방법 2) 경로를 통한 클래스 객체 가져오기(클래스가 존재하는 경로를 입력해 가져옴)
		Class clazz2 = Class.forName("com.yedam.java.ch1101.Key");
		
		System.out.println(clazz2);
		
		
		// 방법 3) 객체로부터 클래스 객체 얻기
		Key key = new Key(1);
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);
		
		// clazz는 Key임!
		// 그걸 이용해 현재 위치에 있는 puppy를 검색(?)할 수 있음
		// 만약 puppy 위치가 동일 폴더가 아니라 111이라는 폴더 밑이라면
		// String photoPath = clazz.getResource("111/puppy.jpg").getPath(); 이렇게 사용 가능
		String photoPath = clazz.getResource("puppy.jpg").getPath();
				
		System.out.println(photoPath);	
		
	}
}
