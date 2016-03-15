package com.celue.inter;

import com.celue.inter.impl.GoodFly;
import com.celue.inter.impl.GoodSing;

public class GoodDuck extends Duck {

	public GoodDuck() {
		fi = new GoodFly();
		si = new GoodSing();
	}

	@Override
	public void display() {
		System.out.println("good duck");
	}

}
