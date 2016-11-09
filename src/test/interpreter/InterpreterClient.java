package test.interpreter;

import test.CreditCard;
import test.proxy.IProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manuv on 3/11/2016.
 */
public class InterpreterClient implements IProxy {
    private Context context;

    public void analyze(CreditCard creditCard) {
        Boolean validExpression = true;
        context = new Context(creditCard.getCode());
        List<IExpression> tree = new ArrayList<>();
        tree.add(new LengthExpression());
        tree.add(new CardCodeExpression());


        for (IExpression expression : tree) {
            try {
                expression.interpret(context);
            } catch (Exception e) {
                validExpression = false;
                System.out.println("INVALID INPUT: " + e.getMessage());
                break;
            }
        }
        if (validExpression) {
            System.out.println("VALID Credit Card");
        } else{
            System.out.println("INVALID Card");
        }

    }
}
