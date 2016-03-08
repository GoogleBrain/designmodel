package com.proto;

public class Prototype implements Cloneable {

	public Prototype clone() {
		try {
			Prototype pro = (Prototype) super.clone();
			return pro;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
