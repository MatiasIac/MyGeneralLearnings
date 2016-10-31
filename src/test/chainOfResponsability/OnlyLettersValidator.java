package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 30/10/2016.
 */
public class OnlyLettersValidator extends Rule{

    @Override
    public void handle(String input) {
        boolean hasOnlyLetters = allLetters(input);
        if (hasOnlyLetters) {
            //notificar que se mueve
            goNext(input);

        } else {
            //notificar que se mueve
            System.out.printf("Error. Input hasn't all letters");
        }
    }

    private boolean allLetters(String input){
        return input.matches("[a-zA-Z]+");
    }
}
