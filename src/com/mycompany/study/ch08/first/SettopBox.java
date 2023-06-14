package com.mycompany.study.ch08.first;

public class SettopBox implements RemoteControl {
	
	public int volume;

	@Override
	public void turnOn() {
		System.out.println("셋톱박스 전원을 켭니다!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("셋톱박스 전원을 끕니다!");
		
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
		System.out.println("셋톱박스 볼륨을 " + this.volume + "로 조절합니다");
		
	}

	
	
}
