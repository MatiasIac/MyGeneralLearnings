package com.santexgroup.dp.observer.model;

public class LowerCaseObserver implements Observer {

	@Override
	public void update(Subject subject) {
		final ContentTextSubject contentSubject = (ContentTextSubject) subject;
		System.out.println("LowerCaseObserver text received: " + contentSubject.getText().toLowerCase());
	}

}
