package com.voya.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	IInstrument keyboard;
	@Autowired
	IInstrument guitar;
	@Autowired
	IInstrument violin;
	
	void playMusic(String choice, String song) {
		if(choice.equals("k"))
			keyboard.play(song);
		if(choice.equals("g"))
			guitar.play(song);
		if(choice.equals("v"))
			violin.play(song);
	}
}
