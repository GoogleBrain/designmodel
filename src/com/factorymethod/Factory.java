package com.factorymethod;

public class Factory implements Ifactory {

	@Override
	public IProduct createPro() {
		return new Product();
	}
}
