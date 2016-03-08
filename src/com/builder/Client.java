package com.builder;

public class Client {
	public static void main(String[] args) {
		Direct dire = new Direct();
		Product pro = dire.getProduct();
		pro.showProduct();

		Product pro2 = dire.getBProduct();
		pro2.showProduct();
	}
}
