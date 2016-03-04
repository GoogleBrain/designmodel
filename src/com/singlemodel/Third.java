package com.singlemodel;

public class Third {
	private static class Inner {
		private static Third th = new Third();
	}

	private Third() {

	}

	public static Third getInstance() {
		return Inner.th;
	}
}
