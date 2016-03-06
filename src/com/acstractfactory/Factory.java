package com.acstractfactory;

public class Factory implements IFactory {

	@Override
	public IProduct1 getShow1() {
		return new Product1();
	}

	@Override
	public IProduct2 getShow2() {
		return new Product2();
	}

}
