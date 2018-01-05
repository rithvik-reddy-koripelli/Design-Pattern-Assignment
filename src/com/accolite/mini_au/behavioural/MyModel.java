package com.accolite.mini_au.behavioural;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
	public static final String SCORE = "score";
	public static final String WICKETS = "wickets";
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();
	Score s;
	public MyModel(){
		s = new Score();
	}
	public class Score{
		private int score;
		private int wickets;
		
		public int getScore() {
			return score;
		}
		
		
		public void setScore(int score) {
			notifyListeners(this,SCORE,this.score,this.score=score);
		}
		public int getWickets() {
			return wickets;
		}
		public void setWickets(int wickets) {
			notifyListeners(this,WICKETS,this.wickets,this.wickets=wickets);
		}
		
		
	}
	
	public void notifyListeners(Object object,String property,int oldvalue,int newvalue )
	{
		for(PropertyChangeListener p:listener)
		{
			p.propertyChange(new PropertyChangeEvent(this, property, oldvalue, newvalue));
		}
	}
	
	
	public void subscribe(PropertyChangeListener newListener)
	{
		listener.add(newListener);
	}
	
	public void setScore(int score)
	{
		s.setScore(score);
	}
	
	public void setWickets(int wicket)
	{
		s.setWickets(wicket);
	}
}
