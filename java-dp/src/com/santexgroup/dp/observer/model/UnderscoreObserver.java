package com.santexgroup.dp.observer.model;

public class UnderscoreObserver implements Observer {

	@Override
	public void update(Subject subject) {
		ContentTextSubject contentSubject = (ContentTextSubject) subject;
		System.out.println("UnderscoreObserver text received: " + contentSubject.getText().replace(" ", "_"));
	}

}
