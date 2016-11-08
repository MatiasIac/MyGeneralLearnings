package test.interpreter;

import test.factoryMethod.Rule;
import test.factoryMethod.RuleFactory;

/**
 * Created by manuv on 3/11/2016.
 */
public class LengthExpression implements IExpression {

    @Override
    public void interpret(Context context) throws Exception {
        String expression = context.getExpression();
        Rule lengthValidator = ruleFactory.createRule(RuleFactory.NINETEEN_CHARACTERS);
        lengthValidator.handle(expression);

    }
}
