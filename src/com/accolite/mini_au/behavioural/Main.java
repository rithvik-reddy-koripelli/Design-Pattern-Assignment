package com.accolite.mini_au.behavioural;

public class Main {
	public static void main(String [] args)
	{
		
		MyModel m = new MyModel();
		Cricbuzz c = new Cricbuzz(m);
		CricInfo ci = new CricInfo(m);
		Espn e = new Espn(m);
		for(int i=5;i<35;i+=5)
		{	
			m.setScore(i);
			m.setWickets(i/5);;
		}
	}
}
