package com.celue.inter;

import com.celue.inter.impl.BadFly;
import com.celue.inter.impl.BadSing;

public class BadDuck extends Duck {

	public BadDuck() {
		fi = new BadFly();
		si = new BadSing();
	}

	@Override
	public void display() {
		System.out.println("bad duck");
	}

}
