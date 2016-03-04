package com.singlemodel;

/**
 * 单例模式
 */
public class Main {
	public static void main(String[] args) {
		/*
		 * 饥汉式单例
		 */
		First f = First.getInstance();
		First f2 = First.getInstance();
		System.out.println(f == f2);

		/*
		 * 懒汉式单例
		 */
		Second se = Second.getInstance();
		Second se2 = Second.getInstance();
		System.out.println(se == se2);

		/*
		 * 强烈推荐这种单例模式
		 */
		Third th = Third.getInstance();
		Third th2 = Third.getInstance();
		System.out.println(th == th2);
	}
}
