package com.yedam.java.example;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		//๐1. ์๋ ฅ์ ๋ฐ๊ธฐ ์ํด scanner ์์ฑ & ๋ถ๋ฌ์ค๊ธฐ
		Scanner sc = new Scanner(System.in);
		
		
			//๐2. ํ์ ์ ์๋ ฅ ๋ฐ๊ธฐ
			System.out.println("์๋ ฅํ  ํ์ ์ > ");
			int count = Integer.parseInt(sc.nextLine());
			Student[] stu = new Student[count];
			// ํ์์ด Student๋ฅผ ์ด์ฉํ stu๋ผ๋ ์ด๋ฆ์ ํฐ ๋ฐฐ์ด ์์ฑ. ๋ฐฐ์ด์ ํฌ๊ธฐ๋ count๋ก ์๋ ฅ๋ฐ์์ด.
			
//			// ์ด๋ ๊ฒ๋ ํฐ stu ๋ผ๋ ๋ง๋ค ์ ์์!
//			Student[] stu = null;
//			System.out.println("์๋ ฅํ  ํ์ ์ > ");
//			int sCount = Integer.parseInt(sc.nextLine());
//			stu = new Student[count];
			
			
			// stu ์์ ๋ค์ด๊ฐ ๊ฐ์ฒด๋ค(์๋ ๋ฐฐ์ด)์ for๋ฌธ์ ์ฌ์ฉํด ์์ฑํ๊ณ , stu๋ฐฐ์ด์ ๋ฃ๊ธฐ๊น์ง ํ  ๊ฑฐ์
			
			//๐3. ๋ฐ์ดํฐ ์๋ ฅ์ ์ํ ๋ฐ๋ณต๋ฌธ ์์ฑ
			// ์๋ ฅ๋ฐ์ stu ๋ฐฐ์ด ํฌ๊ธฐ๋งํผ ๋ฐ๋ณต๋ฌธ์ ์คํ
			for(int i=0; i<stu.length; i++) {
				// 1) Student ํด๋์ค๋ฅผ ์ด์ฉํด ์ ๊ฐ์ฒด student๋ฅผ ๋ง๋ฆ. ๋ฐ๋ณต๋ฌธ์ด ๋ ๋๋ง๋ค ์๋ก์ด ๊ฐ์ฒด๋ฅผ ๋ง๋ค์ด์ผ ์๋ก์ด ๋ฐ์ดํฐ๋ฅผ ์ ์ฅํ  ์ ์์ผ๋ ๋ฐ๋ณต๋ฌธ ์์ ์ ์ด์ค.
				Student student = new Student(); 
				
				// 2-1) ๋ด์ฉ ์๋ ฅ๋ฐ๊ธฐ. ํ์ ์ด๋ฆ ์๋ ฅ
				System.out.println("ํ์ ์ด๋ฆ > ");
				String Name = sc.nextLine(); // ์ค์บ๋๋ฅผ ์ฌ์ฉํด ๋ฌธ์ ์๋ ฅ๋ฐ๊ธฐ
				student.setsName(Name);
				
				// 2-2) ํ๋ฒ ์๋ ฅ
				System.out.println("ํ๋ฒ > ");
				int no = Integer.parseInt(sc.nextLine()); // ์ค์บ๋๋ฅผ ์ฌ์ฉํด ์ซ์ ์๋ ฅ๋ฐ๊ธฐ
				student.setsNo(no);
				
				// 2-3) ๊ตญ์ด ์ ์ ์๋ ฅ
				System.out.println("๊ตญ์ด ์ ์ > ");
				int kor = Integer.parseInt(sc.nextLine());
				student.setKor(kor);
				
				// 2-3) ์ํ ์ ์ ์๋ ฅ
				System.out.println("์ํ ์ ์ > ");
				int math = Integer.parseInt(sc.nextLine());
				student.setMath(math);
				
				// 2-3) ์์ด ์ ์ ์๋ ฅ
				System.out.println("์์ด ์ ์ > ");
				int eng = Integer.parseInt(sc.nextLine());
				student.setEng(eng);
				
				// 3) ๋ด์ฉ์ ๋ฐ์์จ student(๊ฐ์ฒด)๋ฅผ stu ๋ฐฐ์ด์ ํ๋์ฉ ๋ฃ์ด์ฃผ๊ธฐ
				stu[i] = student;
			}
			
			//๐4-1. stu ๋ฐฐ์ด ๊ธธ์ด๋งํผ ๋ฐ๋ณต๋ฌธ์ ๋๋ฆฌ๊ณ , getInfo() ๋ฉ์๋๋ฅผ ๋ถ๋ฌ์ ๋ฐฐ์ด ์์ ๋ด์ฉ์ ์ถ๋ ฅํ๋๋ก ํ๊ธฐ.
			// for๋ฌธ ๋๊ณ  ๋ ํ๋๊น ๋ด์ฉ์ด ๋ค ๋ค์ด์์ ๊ฒ!
			for(int i=0; i<stu.length; i++) {
				stu[i].getInfo();
			}
			
			// ์์์ ๋ฐ์ดํฐ๋ฅผ ์ธํ ์๋ฃ!
			// ๋ฉ์๋์ getInfo()๋ฅผ ๋ง๋ค์ง ๋ง๊ณ 
			//๐4-2. getter๋ฅผ ํตํด ๋ฐ์ดํฐ๋ฅผ ๋ถ๋ฌ์๋ณด์
			for(int i=0; i<stu.length; i++) { // stu๋ฐฐ์ด ํฌ๊ธฐ๋งํผ ๋ฐ๋ณตํ ๊ฑด๋ฐ
				System.out.println("----- ํ์ ์ ๋ณด -----");
				System.out.println("ํ์์ ์ด๋ฆ > " + stu[i].getsName()); // ๊ฐ์ฒด ์์ ์๋ ํ์์ ์ด๋ฆ๊ณผ
				System.out.println("ํ์ ๋ฒํธ > " + stu[i].getsNo()); // ํ๋ฒ์ ์ถ๋ ฅํด๋ณด์
				System.out.println("๊ตญ์ด ์ ์ > " + stu[i].getKor());
				System.out.println("์ํ ์ ์ > " + stu[i].getMath());
				System.out.println("์์ด ์ ์ > " + stu[i].getEng());
			}
		
	}
	
}
