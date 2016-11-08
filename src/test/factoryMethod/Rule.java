package test.factoryMethod;

import test.chainOfResponsability.ChainBase;
import test.observer.IObserver;
import test.observer.ISubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manuv on 30/10/2016.
 */
public abstract class Rule implements ChainBase, ISubject{
    protected String name;
    protected ChainBase next;
    protected List<IObserver> observers = new ArrayList<>();

    public String getName() {
        return name;
    }
    // Chain of responsability methods
    @Override
    public void setNext(ChainBase next) {
        this.next = next;
    }

    @Override
    public void goNext(String input) throws Exception {
        if (next != null) {
            next.handle(input);
        }
    }

    // Observer methods
    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }}
