package com.santexgroup.dp.observer.model;

import java.util.ArrayList;
import java.util.List;

public class ContentTextSubject implements Subject {

	private String text;

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(ob -> ob.update(this));
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
