package com.celue.inter;

public abstract class Duck {
	protected FlyInter fi;
	protected SingInter si;

	public Duck() {
	}

	public void fly() {
		fi.fly();
	}

	public void sing() {
		si.sing();
	}

	public void setFi(FlyInter fi) {
		this.fi = fi;
	}

	public void setSi(SingInter si) {
		this.si = si;
	}

	public abstract void display();

}
