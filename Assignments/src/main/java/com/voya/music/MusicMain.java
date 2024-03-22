package com.voya.music;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.music");
		Performer performer = context.getBean(Performer.class);
		performer.playMusic("k", "music");

	}

}
