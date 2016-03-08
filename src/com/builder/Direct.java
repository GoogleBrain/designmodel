package com.builder;

public class Direct {
	private Builder builder = new ConcreteBuilder();

	public Product getProduct() {
		builder.setPort("宝马", "X7");
		return builder.getProduct();
	}

	public Product getBProduct() {
		builder.setPort("奥迪", "Q5");
		return builder.getProduct();
	}

}
