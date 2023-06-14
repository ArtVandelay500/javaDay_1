package com.mycompany.study.ch08.first;

public class Television implements RemoteControl {

	public int volume;
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전 전원을 켭니다!");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전 전원을 끕니다");
		
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
		System.out.println("TV 볼륨을 " + volume + "로 조절합니다");
		
	}
	
	
}
