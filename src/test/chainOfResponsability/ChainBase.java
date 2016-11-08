package test.chainOfResponsability;

/**
 * Created by manuv on 22/10/2016.
 */
public interface ChainBase {

    public void setNext(ChainBase next);

    public void goNext(String input) throws Exception;

    public void handle(String input) throws Exception;
}
