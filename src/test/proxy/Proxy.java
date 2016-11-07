package test.proxy;

import test.Tarjeta;
import test.interpreter.InterpreterClient;

/**
 * Created by manuv on 6/11/2016.
 */
public class Proxy {
    private final static String VISA = "VISA";
    private final static String MASTER = "MASTER";

    private InterpreterClient client = new InterpreterClient();

    public void analyze(Tarjeta tarjeta) throws Exception {
        String marca = tarjeta.getMarca().toUpperCase();
        if (!marca.equals(VISA) && !marca.equals(MASTER)) {
            System.out.println("Card rejected: " + marca
                    + " is not a valid card brand");
        } else {
            client.analyze(tarjeta);
        }
    }

}
