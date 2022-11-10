package com.yedam.java.example;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		//🍋1. 입력을 받기 위해 scanner 생성 & 불러오기
		Scanner sc = new Scanner(System.in);
		
		
			//🍋2. 학생 수 입력 받기
			System.out.println("입력할 학생 수 > ");
			int count = Integer.parseInt(sc.nextLine());
			Student[] stu = new Student[count];
			// 타입이 Student를 이용한 stu라는 이름의 큰 배열 생성. 배열의 크기는 count로 입력받아옴.
			
//			// 이렇게도 큰 stu 라는 만들 수 있음!
//			Student[] stu = null;
//			System.out.println("입력할 학생 수 > ");
//			int sCount = Integer.parseInt(sc.nextLine());
//			stu = new Student[count];
			
			
			// stu 안에 들어갈 객체들(얘도 배열)은 for문을 사용해 생성하고, stu배열에 넣기까지 할 거임
			
			//🍋3. 데이터 입력을 위한 반복문 작성
			// 입력받은 stu 배열 크기만큼 반복문을 실행
			for(int i=0; i<stu.length; i++) {
				// 1) Student 클래스를 이용해 새 객체 student를 만듦. 반복문이 돌 때마다 새로운 객체를 만들어야 새로운 데이터를 저장할 수 있으니 반복문 안에 적어줌.
				Student student = new Student(); 
				
				// 2-1) 내용 입력받기. 학생 이름 입력
				System.out.println("학생 이름 > ");
				String Name = sc.nextLine(); // 스캐너를 사용해 문자 입력받기
				student.setsName(Name);
				
				// 2-2) 학번 입력
				System.out.println("학번 > ");
				int no = Integer.parseInt(sc.nextLine()); // 스캐너를 사용해 숫자 입력받기
				student.setsNo(no);
				
				// 2-3) 국어 점수 입력
				System.out.println("국어 점수 > ");
				int kor = Integer.parseInt(sc.nextLine());
				student.setKor(kor);
				
				// 2-3) 수학 점수 입력
				System.out.println("수학 점수 > ");
				int math = Integer.parseInt(sc.nextLine());
				student.setMath(math);
				
				// 2-3) 영어 점수 입력
				System.out.println("영어 점수 > ");
				int eng = Integer.parseInt(sc.nextLine());
				student.setEng(eng);
				
				// 3) 내용을 받아온 student(객체)를 stu 배열에 하나씩 넣어주기
				stu[i] = student;
			}
			
			//🍋4-1. stu 배열 길이만큼 반복문을 돌리고, getInfo() 메소드를 불러와 배열 안의 내용을 출력하도록 하기.
			// for문 돌고 난 후니까 내용이 다 들어있을 것!
			for(int i=0; i<stu.length; i++) {
				stu[i].getInfo();
			}
			
			// 위에서 데이터를 세팅 완료!
			// 메소드에 getInfo()를 만들지 말고
			//🍋4-2. getter를 통해 데이터를 불러와보자
			for(int i=0; i<stu.length; i++) { // stu배열 크기만큼 반복할건데
				System.out.println("----- 학생 정보 -----");
				System.out.println("학생의 이름 > " + stu[i].getsName()); // 객체 안에 있는 학생의 이름과
				System.out.println("학생 번호 > " + stu[i].getsNo()); // 학번을 출력해보자
				System.out.println("국어 점수 > " + stu[i].getKor());
				System.out.println("수학 점수 > " + stu[i].getMath());
				System.out.println("영어 점수 > " + stu[i].getEng());
			}
		
	}
	
}
