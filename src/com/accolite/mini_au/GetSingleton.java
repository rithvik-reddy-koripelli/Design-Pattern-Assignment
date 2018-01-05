package com.accolite.mini_au;

public class GetSingleton extends Thread{
		
	Singleton s;
	String name;
	
	public  GetSingleton(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		s = Singleton.getSingleton(this.name);
		System.out.println(s.name);
	}
	
	public static void main(String [] args)
	{
		for(int i=0;i<10;i++)
		{
			GetSingleton t = new GetSingleton(""+i);
			t.start();
		}
	}
}
