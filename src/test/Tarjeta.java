package test;

/**
 * Created by manuv on 5/11/2016.
 */
public class Tarjeta {
    private String marca;
    private String numero;

    public Tarjeta(String marca, String numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumero() {
        return numero;
    }

}
