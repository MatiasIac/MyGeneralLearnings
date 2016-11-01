package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 30/10/2016.
 */
public class OnlyNumbersValidator extends Rule {
    private final String NUMBER_REGEX = "[-]?[0-9]*\\.?[0-9]+";

    public OnlyNumbersValidator(){
        name = "ONLY NUMBERS VALIDATOR";
    }

    @Override
    public void handle(String input) {
        if (allNumbers(input)) {
            notifyObservers();
            goNext(input);
        } else {
            System.out.printf("Error. Input hasn't all numbers");
        }
    }

    private boolean allNumbers(String input){
        return input.matches(NUMBER_REGEX);
    }
}
