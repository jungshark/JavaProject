package com.yedam.java.ch0801;

public class Audio implements RemoteControl{
	// 하나의 인터페이스를 사용해 두가지 구현 클래스를 만듦(Television, Audio)
	
	// 오디오에 리모콘을 만드는 과정
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { 
			this.volume = RemoteControl.MAX_VOLUME; 
		}else if(volume < RemoteControl.MIN_VOLUME) { 
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨: " + this.volume);
		
	}

}
