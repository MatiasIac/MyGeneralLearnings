package com.santexgroup.dp.observer.model;

public class UpperCaseObserver implements Observer {

	@Override
	public void update(Subject subject) {
		final ContentTextSubject contentSubject = (ContentTextSubject) subject;
		System.out.println("UpperCaseObserver text received: " + contentSubject.getText().toUpperCase());
	}

}
