package com.yedam.java.ch0801;

public class Television implements RemoteControl, Search{
	// implements로 상속받은 인터페이스에 있는 모든 메소드를 오버라이딩 해야 함
	// RemoteControl의 기능과 Search의 기능을 받음
	// 다중 인터페이스 구현 클래스 (책 p377)
	
	//🍋 RemoteControl 인터페이스의 메소드 오버라이딩
	// TV에 리모콘을 만드는 과정
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// 상수 불러오는 법: 인터페이스 이름.상수 이름
		if(volume > RemoteControl.MAX_VOLUME) { // 최대볼륨보다 크다면(10보다 큰 볼륨)
			this.volume = RemoteControl.MAX_VOLUME; // 볼륨을 최대볼륨으로 맞춰주고(어차피 10까지밖에 못 사용함)
		}else if(volume < RemoteControl.MIN_VOLUME) { // 볼륨이 0보다 작으면(최저볼륨이 0임)
			this.volume = RemoteControl.MIN_VOLUME; // 볼륨을 최저볼륨인 0으로 맞춰준다
		}else {
			this.volume = volume; // 최대도 아니고 최소도 아닌 볼륨(0~10사이)이라면 그냥 그 볼륨 그대로 세팅
		} // 볼륨에 대한 데이터 무결성을 지키기 위한 메소드
		
		System.out.println("현재 TV 볼륨: " + this.volume); // 내가 세팅한 볼륨을 바로 출력해주는 구문
	}

	
	//🍋 Search 인터페이스의 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

}
