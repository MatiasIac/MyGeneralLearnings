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
        context = new Context(creditCard.getCode());
        List<IExpression> tree = new ArrayList<>();
        tree.add(new LengthExpression());
        tree.add(new CardCodeExpression());


        for (IExpression expression : tree) {
            try {
                expression.interpret(context);
            } catch (Exception e) {
                System.out.println("INVALID INPUT: " + e.getMessage());
            }
        }

    }
}
