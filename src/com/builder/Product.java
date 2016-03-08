package com.builder;

public class Product {
	private String name;
	private String type;

	public void showProduct() {
		System.out.println("名字：" + name);
		System.out.println("类型：" + type);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
}
