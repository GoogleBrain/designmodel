package com.celue.inter.impl;

import com.celue.inter.FlyInter;

public class BadFly implements FlyInter {

	@Override
	public void fly() {
		System.out.println("Bad fly");
	}
}
