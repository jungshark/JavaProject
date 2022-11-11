package com.yedam.java.ch0701;

public class Compute extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Compute 오버라이드 실행");
		return r*r*Math.PI;
	}

	// 마우스 우클릭 -> Source -> Override.. 어쩌구 클릭 -> 오버라이딩 할 것 선택하면 바로 이렇게 뜸
	
	
	
}
