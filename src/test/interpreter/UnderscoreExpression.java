package test.interpreter;

/**
 * Created by manuv on 3/11/2016.
 */
public class UnderscoreExpression implements IExpression{

    @Override
    public void interpret(Context context) throws Exception {
        if (!context.getExpression().contains("_"))
            throw new Exception("Incorrect syntax near _");
String data[] = context.getExpression().split("_");
    }
}
