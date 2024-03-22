package com.voya.music;

import org.springframework.stereotype.Component;

@Component
public class Keyboard implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("Keyboard "+song+" is playing");
		
	}

}
