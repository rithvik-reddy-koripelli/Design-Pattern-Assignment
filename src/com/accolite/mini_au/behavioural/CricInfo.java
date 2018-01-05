package com.accolite.mini_au.behavioural;

import java.beans.PropertyChangeEvent;

public class CricInfo extends Observer{

	public CricInfo(MyModel model) {
		super(model);
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("CricInfo "+evt.getPropertyName()+" new score "+evt.getNewValue()+" old score "+evt.getOldValue());
	}	
}
