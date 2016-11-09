package test;

import test.proxy.Analizador;

/**
 * Created by manuv on 5/11/2016.
 */
public class Main {
    public static void main (String args[]) throws Exception {
        CreditCard creditCardCorrect = new CreditCard("MASTER", "1234_1223_1234_1234");
        CreditCard creditCardIncorrectBrand = new CreditCard("CASPER", "1234_1223_1234_1234");
        CreditCard creditCardIncorrectLengthCode = new CreditCard("VISA", "1234_1223");
        CreditCard creditCardInvalidCode = new CreditCard("MASTER", "1234_ABCD_1234_1234");

        Analizador analizador = new Analizador();

        analizador.analizar(creditCardCorrect);
        System.out.println("##############################################################");
        analizador.analizar(creditCardIncorrectBrand);
        System.out.println("##############################################################");
        analizador.analizar(creditCardIncorrectLengthCode);
        System.out.println("##############################################################");
        analizador.analizar(creditCardInvalidCode);
    }
}
