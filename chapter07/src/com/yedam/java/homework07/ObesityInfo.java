package com.yedam.java.homework07;

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	// 메소드
	// 1) 이름, 키, 몸무게와 비만도를 출력하는 기능
	@Override
	public void getInformation() {
		String result = null;
		if(getObesity() <= 18.5) {
			result ="저체중";
		}
		else if(getObesity() <= 22.9) {
			result="정상";
		}
		else if(getObesity() <= 24.9) {
			result="과체중";
		}else {
			result="비만";
		}
		
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + 
				", " + result + "입니다.");
	}
	
	// 2) 비만도를 구하는 기능
	public double getObesity() {
		double obesity = 0;
		obesity = Math.round((weight - getStandardWeight()) / getStandardWeight() * 100);
		return obesity;
	}

}
