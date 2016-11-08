package test.interpreter;

import test.factoryMethod.IFactory;
import test.factoryMethod.RuleFactory;

/**
 * Created by manuv on 31/10/2016.
 */
public interface IExpression {
    IFactory ruleFactory = new RuleFactory();
    public void interpret(Context context) throws Exception;
}
