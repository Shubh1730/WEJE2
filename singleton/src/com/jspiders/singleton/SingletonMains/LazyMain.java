package com.jspiders.singleton.SingletonMains;

import com.jspiders.singleton.SingletonLazy.SingletonLazy;

public class LazyMain {
	public static void main(String[] args) {
		SingletonLazy.getObj();
		SingletonLazy.getObj();
		SingletonLazy.getObj();
	}

}
