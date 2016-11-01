package test.factoryMethod;

import test.chainOfResponsability.IntegerValidation;
import test.chainOfResponsability.LengthValidator;
import test.chainOfResponsability.OnlyLettersValidator;
import test.chainOfResponsability.OnlyNumbersValidator;
import test.observer.AnotherLogger;
import test.observer.ConsoleLogger;

/**
 * Created by manuv on 29/10/2016.
 */
public class RuleFactory implements IFactory {
    private static final String ONLY_NUMBERS = "only numbers";
    private static final String ONLY_LETTERS = "only letters";
    private static final String NUMBER_INTEGER = "number integer";
    private static final String TEN_CHARACTERS = "ten characters";

    private ConsoleLogger consoleLogger = new ConsoleLogger();
    private AnotherLogger anotherLogger = new AnotherLogger();


    @Override
    public Rule createRule(String type) {
        Rule rule = null;
        switch (type) {
            case ONLY_NUMBERS:
                rule = new OnlyNumbersValidator();
                break;
            case ONLY_LETTERS:
                rule = new OnlyLettersValidator();
                break;
            case NUMBER_INTEGER:
                rule = new IntegerValidation();
                break;
            case TEN_CHARACTERS:
                rule = new LengthValidator(10);
        }
        rule.attach(consoleLogger);
        rule.attach(anotherLogger);

        return rule;
    }

}
