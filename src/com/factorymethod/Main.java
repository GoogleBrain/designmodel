package com.factorymethod;

public class Main {
	public static void main(String[] args) {
		Ifactory fac = new Factory();
		IProduct pro = fac.createPro();
		pro.productMethod();
	}
}
