package test.interpreter;

import test.factoryMethod.Rule;
import test.factoryMethod.RuleFactory;

/**
 * Created by manuv on 3/11/2016.
 */
public class CardCodeExpression implements IExpression{

    @Override
    public void interpret(Context context) throws Exception {
        if (!context.getExpression().contains("_"))
            throw new Exception("Incorrect syntax near _");
        String data[] = context.getExpression().split("_");
        for (String segmentCode: data) {
            Rule lengthValidator = ruleFactory.createRule(RuleFactory.FOUR_DIGITS);
            Rule onlyNumbers = ruleFactory.createRule(RuleFactory.ONLY_NUMBERS);
            Rule allIntegers = ruleFactory.createRule(RuleFactory.NUMBER_INTEGER);

            lengthValidator.setNext(onlyNumbers);
            onlyNumbers.setNext(allIntegers);

            lengthValidator.handle(segmentCode);
        }
    }
}
