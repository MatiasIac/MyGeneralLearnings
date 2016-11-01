package test.observer;

/**
 * Created by manuv on 31/10/2016.
 */
public interface ISubject {

    void attach(IObserver observer);

    void notifyObservers();

}
