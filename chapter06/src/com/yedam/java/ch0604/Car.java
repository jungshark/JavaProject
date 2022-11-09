package com.yedam.java.ch0604;

public class Car {
	//🍋 필드
	int gas;
	
	//🍋 생성자
	
	
	//🍋 메소드
	void setGas(int gas) {
		this.gas = gas; // gas라는 필드값에 매개변수로 받은 gas를 넣어주자
	}	
	
	//🍑 현재 가스의 잔량을 확인하는 메소드
	boolean isLeftGas() {
		if(this.gas == 0) { // this를 안 써줘도 되는데, 그 이유는 내부에 다른 gas가 없기 때문에 자동으로 gas 메소드를 받아오기 때문(?)
			System.out.println("gas가 없습니다.");
			return false; // boolean 타입이라 return이 꼭 있어야 함(?)
		}
		
		System.out.println("gas가 있습니다.");
		return true;
	}
		// 이 둘을 if~else로 묶지 않는 이유?
		// return 구문이 존재하기 때문임
		// 진행되다가 return을 만나면 그 자리에서 바로 중단! 더 이상 실행되지 않음
		// 그러니까 굳이 둘을 묶을 필요가 없음. 중단돼서 실행이 안 되는데 뭣하러..
		
	/*
	void run() {
		while(true) {
			if(this.gas > 0) {
				System.out.println("달립니다. (gas 잔량: " + this.gas + ")");
				this.gas--; // 한 번 달리면 가스가 줄어들어야 함
			}else {
				System.out.println("멈춥니다. (gas 잔량: " + this.gas + ")");
				return; // 해당 메소드를 멈추는 것
				// break; // 반복문을 멈추게 하는 것
//				System.out.println("종료합니다."); // Unreachable code 오류.
				// return 구문 뒤에는 어떤것도 실행되지 않기 때문에 이런 오류가 남.
				*/
				
	
	// 다른 메소드를 가져와서 바로 호출도 가능함
	void run() {
		while(true) {
			if(isLeftGas()) { // while문이 도는 동안 isLeftGas()얘가 계속 실행되어 남아있으면 true, 다 쓰면 false라고 보내줄 것.
				System.out.println("달립니다. (gas 잔량: " + this.gas + ")");
				this.gas--; // 한 번 달리면 가스가 줄어들어야 함
			}else {
				System.out.println("멈춥니다. (gas 잔량: " + this.gas + ")");
				return;
				
				
				// return
				// 1. 주 목적: 메소드 종료 (exit라고 생각하면 됨. 어느 위치에 있든 거기서 바로 종료)
				// 2. 리턴 타입이 있는 경우: 정해진 타입에 맞게 값을 같이 들고 가야 하는 것
				// 2-1. 리턴 타입이 없는 경우: 값 없이 그냥 종료시키는 용도
			}
		}
		
		
	}
}
