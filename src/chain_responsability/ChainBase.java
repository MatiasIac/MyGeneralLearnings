package chain_responsability;

/**
 * Created by manuv on 22/10/2016.
 */
public abstract class ChainBase {
    private ChainBase next;

    public void setNext(ChainBase next) {
        this.next = next;
    }

    public void goNext(String input) {
        if (next != null) {
            next.handle(input);
        }
        else {
            System.out.println("Valid input!");
        }
    }

    public abstract void handle(String input);
}
