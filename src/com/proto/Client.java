package com.proto;

public class Client {
	public static void main(String[] args) {
		ConcreteType con = new ConcreteType();
		for(int i=0;i<10;i++){
			ConcreteType ct = (ConcreteType) con.clone();
			ct.show();
		}
	}

}
