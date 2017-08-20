package com.di;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FortuneTeller implements FortuneService {

	@Override
	public String knowFortune() {
	
		String[] fortune= {"today is your bad day", "you're poor", "get some money"};
		//Random randNum=new Random(System.currentTimeMillis());
		int randIt=ThreadLocalRandom.current().nextInt(145,150);
		
		return fortune[randIt];
	}

	
}
