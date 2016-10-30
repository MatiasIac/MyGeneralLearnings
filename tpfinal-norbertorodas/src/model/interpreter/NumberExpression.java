package model.interpreter;

import model.factorymethod.Creator;
import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;
import model.observer.Observer;
import model.observer.Subject;

/**
 * Represents a numeric expressoin with a set of validation rules associated
 * 
 * @author beto
 *
 */
public class NumberExpression implements Expression, Observer {

	private Creator creator = new RuleCreator();
	private InterpreterContext context;

	@Override
	public void interpret(InterpreterContext interpreterContext) {
		context = interpreterContext;
		final String vehiclePlate = interpreterContext.getVehiclePlate();
		final String middle = vehiclePlate.substring(2, 5);

		final Rule rule = getRule();
		rule.handle(middle);
	}

	@Override
	public Rule getRule() {
		final Rule onlyNumberRule = creator.create(RuleCreator.ONLY_NUMBER);
		onlyNumberRule.addObserver(this);

		final Rule numberIntegerRule = creator
				.create(RuleCreator.NUMBER_INTEGER);
		numberIntegerRule.addObserver(this);

		final Rule threeDigitsRule = creator.create(RuleCreator.THREE_DIGITS);
		threeDigitsRule.addObserver(this);

		onlyNumberRule.setNext(numberIntegerRule);
		numberIntegerRule.setNext(threeDigitsRule);

		return onlyNumberRule;
	}

	@Override
	public void update(Subject subject) {
		Rule rule = (Rule) subject;
		context.setValid(rule.getValid());
	}
}
