package model.interpreter;

import model.factorymethod.Creator;
import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;
import model.observer.Observer;
import model.observer.Subject;

/**
 * Represents a text expressoin with a set of validation rules associated
 * 
 * @author beto
 *
 */
public class TextExpression implements Expression, Observer {

	private Creator creator = new RuleCreator();
	private InterpreterContext context;

	@Override
	public void interpret(InterpreterContext interpreterContext) {

		context = interpreterContext;
		String vehiclePlate = interpreterContext.getVehiclePlate();
		final String first = vehiclePlate.substring(0, 2);
		getRule().handle(first);

		final String last = vehiclePlate.substring(5, 7);
		getRule().handle(last);
	}

	@Override
	public Rule getRule() {
		final Rule onlyTextRule = creator.create(RuleCreator.ONLY_LETTERS);
		onlyTextRule.addObserver(this);

		final Rule twoLettersRule = creator.create(RuleCreator.TWO_LETTERS);
		twoLettersRule.addObserver(this);

		final Rule textInUpperCaseRule = creator
				.create(RuleCreator.TEXT_IN_UPPERCASE);
		textInUpperCaseRule.addObserver(this);

		onlyTextRule.setNext(twoLettersRule);
		twoLettersRule.setNext(textInUpperCaseRule);

		return onlyTextRule;
	}

	@Override
	public void update(Subject subject) {
		Rule rule = (Rule) subject;
		context.setValid(rule.getValid());
	}

}
