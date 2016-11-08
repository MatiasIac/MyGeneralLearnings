package chain_responsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 30/10/2016.
 */
public class OnlyLettersValidator extends Rule{

    public OnlyLettersValidator(){
        name = "ONLY LETTERS VALIDATOR";
    }

    @Override
    public void handle(String input) {
        boolean hasOnlyLetters = allLetters(input);
        if (hasOnlyLetters) {
            notifyObservers();
            goNext(input);
        } else {
            System.out.printf("Error. Input hasn't all letters");
        }
    }

    private boolean allLetters(String input){
        return input.matches("[a-zA-Z]+");
    }
}
