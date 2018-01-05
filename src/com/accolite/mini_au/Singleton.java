package com.accolite.mini_au;

public class Singleton {
	
	private static Singleton singleton;
	String name;
	private Singleton(String name)
	{
		this.name = name;
	}
	
	public static Singleton getSingleton(String name)
	{
		if(singleton==null)
		{
			synchronized (Singleton.class) {
				if(singleton==null)
				{
					singleton = new Singleton(name);
				}
			}
		}
		return singleton;
	}
	
}
