package test;

/**
 * Created by manuv on 5/11/2016.
 */
public class CreditCard {
    private String brand;
    private String code;

    public CreditCard(String brand, String code) {
        this.brand = brand;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public String getCode() {
        return code;
    }

}
