package com.singlemodel;

public class First {
	private static First first = new First();

	private First() {

	}

	public static First getInstance() {
		return first;
	}

}
