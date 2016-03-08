package com.builder;

public class ConcreteBuilder extends Builder {
	private Product pro = new Product();

	@Override
	public void setPort(String n1, String n2) {
		pro.setName(n1);
		pro.setType(n2);
	}

	@Override
	public Product getProduct() {
		return pro;
	}

}
