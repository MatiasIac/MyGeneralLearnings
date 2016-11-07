package test.interpreter;

import test.Tarjeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manuv on 3/11/2016.
 */
public class InterpreterClient {
    private Context context;

    public void analyze(Tarjeta tarjeta) throws Exception {
        context = new Context(tarjeta.getNumero());
        List<IExpression> tree = new ArrayList<>();
        tree.add(new UnderscoreExpression());

        for (IExpression expression : tree) {
            expression.interpret(context);
            //result = result && interpreterContext.isValid();
        }

    }
}
