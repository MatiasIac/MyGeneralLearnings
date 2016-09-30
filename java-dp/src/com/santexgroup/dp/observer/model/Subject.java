package com.santexgroup.dp.observer.model;

public interface Subject {

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();

}
