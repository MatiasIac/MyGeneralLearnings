package test.proxy;

import test.CreditCard;
import test.interpreter.InterpreterClient;

/**
 * Created by manuv on 6/11/2016.
 */
public class Proxy implements IProxy {
    private final static String VISA = "VISA";
    private final static String MASTER = "MASTER";

    private InterpreterClient client = new InterpreterClient();

    public void analyze(CreditCard creditCard) {
        String brand = creditCard.getBrand().toUpperCase();
        if (!brand.equals(VISA) && !brand.equals(MASTER)) {
            System.out.println("Credit Card rejected: " + brand + " is not a valid credit card brand");
            System.out.println("creditCard = [" + creditCard + "]");
        } else {
            client.analyze(creditCard);
        }
    }

}
