package com.acstractfactory;

public class Main {
	public static void main(String[] args) {
		IFactory f = new Factory();
		f.getShow1().show();
		f.getShow2().show();
	}
}
