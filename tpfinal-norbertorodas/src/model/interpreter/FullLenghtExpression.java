package model.interpreter;

import model.factorymethod.Creator;
import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;
import model.observer.Observer;
import model.observer.Subject;

/**
 * An expression associate with a content to be processed
 * 
 * @author beto
 *
 */
public class FullLenghtExpression implements Expression, Observer {

	private Creator creator = new RuleCreator();
	private InterpreterContext context;

	@Override
	public void interpret(InterpreterContext interpreterContext) {
		context = interpreterContext;
		final String vehiclePlate = interpreterContext.getVehiclePlate();
		final Rule rule = getRule();
		rule.handle(vehiclePlate);
	}

	@Override
	public Rule getRule() {
		final Rule sevenCharacters = creator
				.create(RuleCreator.SEVEN_CHARACTERS);
		sevenCharacters.addObserver(this);
		return sevenCharacters;
	}

	@Override
	public void update(Subject subject) {
		Rule rule = (Rule) subject;
		context.setValid(rule.getValid());
	}
}
