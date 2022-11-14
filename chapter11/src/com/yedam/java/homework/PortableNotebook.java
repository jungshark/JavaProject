package com.yedam.java.homework;

public class PortableNotebook implements Notebook, Tablet{
	// Notebook 인터페이스와 Tablet 인터페이스를 구현한 클래스

	// 필드
	public int MODE;
	public String doc; // 문서 프로그램
	public String internet; // 인터넷 브라우저
	public String videoType; // 영상 종류
	public String appType; // 앱 종류
	
	
	// 생성자
	public PortableNotebook(String doc, String internet, String videoType, String appType) {
		this.MODE = NOTEBOOK_MODE;
		this.doc = doc;
		this.internet = internet;
		this.videoType = videoType;
		this.appType = appType;
		System.out.println("NOTEBOOK_MODE");
	}
	
	
	// 메소드
	@Override
	public void writeDocumentaion() {
		System.out.println(doc + "을 통해 문서를 작성");
	}
	
	@Override
	public void searchInternet() {
		System.out.println(internet + "을 통해 인터넷을 검색");
	}
	
	@Override
	public void watchVideo() {
		System.out.println(videoType + "를 시청");
	}

	@Override
	public void useApp() {
		if(MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
		}else {
			MODE = NOTEBOOK_MODE;
		}
		System.out.println(appType + "을 실행");
	}

	// 5) 모드를 바꾸고 현재 모드를 출력하는 기능
	public void changeMode() {
		String nowMode = null;
		if(MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			nowMode = "TABLET_MODE";
		}else {
			MODE = NOTEBOOK_MODE;
			nowMode = "NOTEBOOK_MODE";
		}
		System.out.println(nowMode);
	}

	
}
