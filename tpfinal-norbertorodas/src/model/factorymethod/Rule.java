package model.factorymethod;

import java.util.ArrayList;
import java.util.List;

import model.chainofresponsability.Handler;
import model.observer.Observer;
import model.observer.Subject;

/**
 * Represents an abstract object which could be created through a factory. Also
 * implements the interface {@link Handler} as part of implementation of chain
 * of responsability Method. Furthermore behaves as subject (observer pattern)
 * 
 * @author beto
 *
 */
public abstract class Rule implements Handler, Subject {

	protected Handler next;
	protected List<Observer> observers = new ArrayList<>();
	private String causeFailMessage;
	private Boolean valid;

	public Handler getNext() {
		return next;
	}

	@Override
	public void setNext(Handler handler) {
		next = handler;
	}

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
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	protected void moveToNext(String content) {
		if (next != null) {
			next.handle(content);
		}
	}

	public abstract String getName();

	public String getCauseFailMessage() {
		return causeFailMessage;
	}

	public void setCauseFailMessage(String causeFailMessage) {
		this.causeFailMessage = causeFailMessage;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
