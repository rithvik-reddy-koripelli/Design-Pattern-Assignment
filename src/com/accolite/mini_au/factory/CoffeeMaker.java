package com.accolite.mini_au.factory;

import java.util.Scanner;

public class CoffeeMaker {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);;
		for(int i =0;i<10;i++) {
			System.out.println("enter an option");
			String input=s.nextLine();
			Coffee c = CoffeeFactory.getCoffee(input);
			if(c!=null)
				c.deliver();
		
		}
		s.close();
	}
}
