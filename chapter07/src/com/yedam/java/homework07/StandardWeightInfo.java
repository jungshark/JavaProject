package com.yedam.java.homework07;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	// 메소드
	//1) 이름, 키, 몸무게와 표준체중을 출력하는 기능
	@Override
	public void getInformation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + 
				", 표준체중 " + getStandardWeight() + "입니다.");
	}

	// 2) 표준체중을 구하는 기능
	public double getStandardWeight() {
		double standardWeight = 0;
		standardWeight = Math.round(height - 100) * 0.9;
		return standardWeight;
	}
	
}
