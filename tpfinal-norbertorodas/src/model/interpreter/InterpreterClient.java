package model.interpreter;

import java.util.ArrayList;
import java.util.List;

import model.proxy.IAnalyzer;

/**
 * A client which manages the set of expressions to be used during the analysis
 * process
 * 
 * @author beto
 *
 */
public class InterpreterClient implements IAnalyzer {
	private InterpreterContext interpreterContext = new InterpreterContext();

	@Override
	public void analyze(String region, String input) {
		interpreterContext.setVehiclePlate(input);

		List<Expression> tree = new ArrayList<>();
		tree.add(new FullLenghtExpression());
		tree.add(new TextExpression());
		tree.add(new NumberExpression());

		Boolean result = Boolean.TRUE;

		for (Expression expression : tree) {
			expression.interpret(interpreterContext);
			result = result && interpreterContext.isValid();
		}

		if (result) {
			System.out.println("\n* The content IS VALID");
		} else {
			System.out.println("\n* The content IS NOT VALID");
		}

	}

}
