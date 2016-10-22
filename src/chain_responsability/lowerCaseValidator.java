package chain_responsability;

/**
 * Created by manuv on 22/10/2016.
 */
public class lowerCaseValidator extends ChainBase {

    @Override
    public void handle(String input) {
        if (input.matches("[a-z]+")){
            goNext(input);
        }
        else{
            System.out.println("Error, Input hasn't all lower case chars");

        }
    }
}
