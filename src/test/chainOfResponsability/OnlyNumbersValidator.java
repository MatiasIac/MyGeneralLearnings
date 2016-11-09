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
    public void handle(String input) throws Exception {
        System.out.println("-----");
        System.out.println("Analyzing in: " + name + ". input = [" + input + "]");
        notifyObservers();
        if (allNumbers(input)) {
            goNext(input);
        } else {
            throw new Exception("Error. Input hasn't all numbers");
        }
    }

    private boolean allNumbers(String input){
        return input.matches(NUMBER_REGEX);
    }
}
