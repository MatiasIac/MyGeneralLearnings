package test.proxy;

import test.CreditCard;

/**
 * Created by manuv on 8/11/2016.
 */
public class Analizador {
    IProxy proxy;

    public void analizar(CreditCard creditCard) {
        proxy = new Proxy();
        proxy.analyze(creditCard);
    }
}
