package com.jarvis.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune(){
		return "Today is Happy Fortune day";
	}

}
