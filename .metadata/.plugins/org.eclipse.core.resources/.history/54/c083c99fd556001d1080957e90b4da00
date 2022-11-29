package com.jspiders.singleton.SingletonLazy;

public class SingletonLazy {
	static SingletonLazy singletonLazy;
	int objectCount;
	
	private SingletonLazy()
	{
		objectCount++;
		System.out.println("Objected Created "+ objectCount +" times.");
	}
	public static SingletonLazy getObj() 
	{
		if (singletonLazy==null) {
			singletonLazy = new SingletonLazy();
			return singletonLazy;
		}
		return singletonLazy;
	}
}
