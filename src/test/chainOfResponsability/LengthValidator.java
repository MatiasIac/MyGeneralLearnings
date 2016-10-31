package test.chainOfResponsability;

import test.factoryMethod.Rule;

/**
 * Created by manuv on 22/10/2016.
 */
public class LengthValidator extends Rule {

    private int sizeLimit;

    public LengthValidator (int sizeLimit){
        this.sizeLimit = sizeLimit;
    }

    @Override
    public void handle(String input) {
        if (input.length() < sizeLimit){
            //notificar que se mueve
            goNext(input);

        }
        else{
            //notificar que se mueve
            System.out.printf("Error. Input exceeds size limit");
        }
    }
}
