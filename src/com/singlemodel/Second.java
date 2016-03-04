package com.singlemodel;

public class Second {
	private static Second second = null;

	private Second() {

	}

	public static synchronized Second getInstance() {
		if (second == null) {
			second = new Second();
		}
		return second;
	}

}
