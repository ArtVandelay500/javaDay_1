package com.mycompany.study.ch08.first;

public interface RemoteControl {
	
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	void turnOff();
	public abstract void setVolume(int volume);
	
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음모드 입니다");
		}else {
			System.out.println("무음모드 해제합니다");
		}
	}
	
	static void changeBattery() {
		System.out.println("배터리를 교체합니다!");
	}
}
