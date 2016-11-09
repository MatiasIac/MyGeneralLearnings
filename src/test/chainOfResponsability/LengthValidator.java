package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 22/10/2016.
 */
public class LengthValidator extends Rule {

    private int sizeLimit;

    public LengthValidator (int sizeLimit){
        name = "LENGTH VALIDATOR";
        this.sizeLimit = sizeLimit;
    }

    @Override
    public void handle(String input) throws Exception {
        System.out.println("-----");
        System.out.println("Analyzing in: " + name + ". input = [" + input + "]");
        notifyObservers();
        if (input.length() == sizeLimit){
            goNext(input);
        }
        else{
            throw new Exception("Error. Input doesn't have " + sizeLimit + " characters");
        }
    }
}
