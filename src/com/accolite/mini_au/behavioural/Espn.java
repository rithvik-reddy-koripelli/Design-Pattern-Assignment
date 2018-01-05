package com.accolite.mini_au.behavioural;

import java.beans.PropertyChangeEvent;

public class Espn extends Observer{

	public Espn(MyModel model) {
		super(model);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("ESPN "+evt.getPropertyName()+" old value "+evt.getOldValue()+" new value "+evt.getNewValue() );
	}
	
}
