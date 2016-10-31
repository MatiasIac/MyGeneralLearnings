package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 30/10/2016.
 */
public class OnlyNumbersValidator extends Rule {
    private final String NUMBER_REGEX = "[-]?[0-9]*\\.?[0-9]+";

    @Override
    public void handle(String input) {
        if (allNumbers(input)) {
            //notificar que se mueve
            goNext(input);

        } else {
            //notificar que se mueve
            System.out.printf("Error. Input hasn't all letters");
        }
    }

    private boolean allNumbers(String input){
        return input.matches(NUMBER_REGEX);
    }
}
