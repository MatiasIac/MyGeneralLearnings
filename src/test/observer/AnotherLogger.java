package test.observer;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 1/11/2016.
 */
public class AnotherLogger implements IObserver {

    @Override
    public void update(Rule rule) {
        System.out.println("AnotherLogger.update: Analyzing rule = [" + rule.getName() + "]");

    }
}
