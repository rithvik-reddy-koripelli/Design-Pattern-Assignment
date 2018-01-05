package com.accolite.mini_au.factory;

public class CoffeeFactory {
	static Coffee coffee;
	public static Coffee getCoffee(String s)
	{
		if("a".equals(s))
		{
			coffee = new Cappuccino();
		}
		else if ("b".equals(s))
		{
			coffee = new Mocha();
		}
		
		else if ("c".equals(s))
		{
			coffee = new Latte();
		}
		else
		{
			System.out.println("Wrong Input");
			return null;
		}
		return coffee;
	}
}
