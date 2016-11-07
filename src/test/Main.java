package test;

import test.proxy.Proxy;

/**
 * Created by manuv on 5/11/2016.
 */
public class Main {
    public static void main (String args[]) throws Exception {
        Tarjeta tarjeta = new Tarjeta("MASTER", "24");
Proxy proxy = new Proxy();
        proxy.analyze(tarjeta);
    }
}
