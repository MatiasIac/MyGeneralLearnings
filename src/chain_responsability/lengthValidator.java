package chain_responsability;

/**
 * Created by manuv on 22/10/2016.
 */
public class lengthValidator extends ChainBase {

    @Override
    public void handle(String input) {
        if (input.length() < 10){
            goNext(input);
        }
        else{
            System.out.printf("Error. Input exceeds size limit");
        }
    }
}
