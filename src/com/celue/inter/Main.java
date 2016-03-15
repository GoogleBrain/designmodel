package com.celue.inter;

public class Main {
	public static void main(String[] args) {
		Duck good = new GoodDuck();
		Duck bad = new BadDuck();

		good.fly();
		good.sing();

		bad.fly();
		bad.sing();

	}
}
