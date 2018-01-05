package com.accolite.mini_au.behavioural;

import java.beans.PropertyChangeEvent;

public class Cricbuzz extends Observer{

	public Cricbuzz(MyModel model) {
		super(model);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Cricbuzz " +evt.getPropertyName()+" new value "+evt.getNewValue() );
	}
	
}
