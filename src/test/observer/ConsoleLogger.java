package test.observer;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 1/11/2016.
 */
public class ConsoleLogger implements IObserver {

    @Override
    public void update(Rule rule) {
        System.out.println("ConsoleLogger.update: Analyzing rule = [" + rule.getName() + "]");
    }

}
