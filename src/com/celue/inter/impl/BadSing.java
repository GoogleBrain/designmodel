package com.celue.inter.impl;

import com.celue.inter.SingInter;

public class BadSing implements SingInter {

	@Override
	public void sing() {
		System.out.println("bad sing");
	}
}
