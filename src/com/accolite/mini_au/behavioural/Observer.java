package com.accolite.mini_au.behavioural;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observer implements PropertyChangeListener{

	public  Observer(MyModel model) {
		model.subscribe(this);
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println(evt.getPropertyName()+" "+evt.getOldValue()+ " "+evt.getNewValue());
	}
}


