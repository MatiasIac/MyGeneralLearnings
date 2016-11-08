package test;

import test.proxy.Analizador;

/**
 * Created by manuv on 5/11/2016.
 */
public class Main {
    public static void main (String args[]) throws Exception {
        CreditCard creditCard = new CreditCard("MASTER", "24");
        Analizador analizador = new Analizador();
        analizador.analizar(creditCard);
    }
}
