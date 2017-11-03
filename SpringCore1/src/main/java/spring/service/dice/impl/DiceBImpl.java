package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;

public class DiceBImpl implements Dice {
	private int value;
	
	
	public DiceBImpl() {
		System.out.println("::"+getClass().getName()+"»ý¼ºÀÚ call..");
	}

	@Override
	public void selectedNumber() {
		value = new Random().nextInt(6) + 1;
		
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
