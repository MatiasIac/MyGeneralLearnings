package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 30/10/2016.
 */
public class IntegerValidation extends Rule {
    private final String INTEGER_REGEX = "[-]?[0-9]+";

    @Override
    public void handle(String input) {
        if (isInteger(input)) {
            //notificar que se mueve
            goNext(input);

        } else {
            //notificar que se mueve
            System.out.printf("Error. Input hasn't all letters");
        }
    }

    private boolean isInteger(String input){
        return input.matches(INTEGER_REGEX);
    }
}
