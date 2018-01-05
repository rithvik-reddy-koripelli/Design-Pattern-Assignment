package com.accolite.mini_au.factory;

public abstract class Coffee {
	
	public void Serve()
	{
		System.out.println("Serve coffee");
	}
	
	
	public abstract void makeCoffee();
	
	public void deliver()
	{
		Serve();
		makeCoffee();
	}
}
