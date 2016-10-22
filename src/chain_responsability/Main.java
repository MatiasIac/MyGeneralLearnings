package chain_responsability;

/**
 * Created by manuv on 22/10/2016.
 */
public class Main {

    public static void main (String [] args){
        String input = "pepaAe";
        ChainBase validation1 = new lengthValidator();
        ChainBase validation2 = new lowerCaseValidator();

        validation1.setNext(validation2);

        validation1.handle(input);
    }
}
