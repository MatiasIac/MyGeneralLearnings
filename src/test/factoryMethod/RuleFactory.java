package test.factoryMethod;

import test.chainOfResponsability.IntegerValidation;
import test.chainOfResponsability.LengthValidator;
import test.chainOfResponsability.OnlyNumbersValidator;
import test.observer.AnotherLogger;
import test.observer.ConsoleLogger;

/**
 * Created by manuv on 29/10/2016.
 */
public class RuleFactory implements IFactory {
    public static final String ONLY_NUMBERS = "only numbers";
    public static final String FOUR_DIGITS = "four digits";
    public static final String NUMBER_INTEGER = "number integer";
    public static final String NINETEEN_CHARACTERS = "nineteen characters";

    private ConsoleLogger consoleLogger = new ConsoleLogger();
    private AnotherLogger anotherLogger = new AnotherLogger();


    @Override
    public Rule createRule(String type) {
        Rule rule = null;
        switch (type) {
            case ONLY_NUMBERS:
                rule = new OnlyNumbersValidator();
                break;
            case NUMBER_INTEGER:
                rule = new IntegerValidation();
                break;
            case NINETEEN_CHARACTERS:
                rule = new LengthValidator(19);
                break;
            case FOUR_DIGITS:
                rule = new LengthValidator(4);
        }
        rule.attach(consoleLogger);
        rule.attach(anotherLogger);

        return rule;
    }

}
