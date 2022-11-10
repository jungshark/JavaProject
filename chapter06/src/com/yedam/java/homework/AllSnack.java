package com.yedam.java.homework;

import java.util.Scanner;

public class AllSnack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 상품 수 입력받기
		System.out.println("상품 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Snack[] yum = new Snack[count];
		
		// for문을 이용해 배열 크기만큼 돌리면서 정보 채우기
		for(int i=0; i<yum.length; i++) {
			Snack snack = new Snack();
			
			System.out.println("상품 이름 > ");
			String name = sc.nextLine();
			snack.setName(name);
			
			System.out.println("상품 가격 > ");
			int price = Integer.parseInt(sc.nextLine());
			snack.setPrice(price);
			
			yum[i] = snack;
		}
		
		// 입력받은 상품 정보 출력
		for(int i=0; i<yum.length; i++) {
			yum[i].getInfo();
		}
		
		// 최고 가격 구하기
		int sum = 0;
		int total = 0;
		int max = yum[0].getPrice();
		
		for(int i=0; i<yum.length; i++) {
			if(max < yum[i].getPrice()) {
				max = yum[i].getPrice();
			}
		}
		
		// 최고 가격을 제외한 나머지 상품들의 합 구하기
		for(int i=0; i<yum.length; i++) {
			sum += yum[i].getPrice();
		} 
		total = sum - max;
		
		// 분석 결과 출력(최고가격, 상품 가격 합)
		System.out.println("===== 상품 분석 =====");
		System.out.println("상품의 최고 가격: " + max + "원");
		System.out.println("최고 가격인 상품을 제외한 나머지 상품 가격들의 합: " + total + "원");
		
	}

}
