package model.factorymethod;

import model.chainofresponsability.FixedSizeRule;
import model.chainofresponsability.NumberIntegerRule;
import model.chainofresponsability.OnlyNumberRule;
import model.chainofresponsability.OnlyLettersRule;
import model.chainofresponsability.TextInUpperCaseRule;
import model.observer.RuleFailsObserver;

/**
 * Creates Rules according to type passed as parameters (Factory Method)
 * 
 * @author beto
 *
 */
public class RuleCreator implements Creator {

	public static final String ONLY_NUMBER = "only number";
	public static final String ONLY_LETTERS = "only letters";
	public static final String NUMBER_INTEGER = "number integer";
	public static final String THREE_DIGITS = "three digits";
	public static final String TWO_LETTERS = "two leters";
	public static final String TEXT_IN_UPPERCASE = "text in uppercase";
	public static final String SEVEN_CHARACTERS = "seven characters";

	private final RuleFailsObserver ruleFailsObserver = new RuleFailsObserver();

	@Override
	public Rule create(String type) {

		Rule rule = null;

		switch (type) {
		case ONLY_NUMBER:
			rule = new OnlyNumberRule();
			break;
		case ONLY_LETTERS:
			rule = new OnlyLettersRule();
			break;
		case NUMBER_INTEGER:
			rule = new NumberIntegerRule();
			break;
		case THREE_DIGITS:
			rule = new FixedSizeRule(3);
			break;
		case TWO_LETTERS:
			rule = new FixedSizeRule(2);
			break;
		case TEXT_IN_UPPERCASE:
			rule = new TextInUpperCaseRule();
			break;
		case SEVEN_CHARACTERS:
			rule = new FixedSizeRule(7);
			break;
		default:
			break;
		}

		rule.addObserver(ruleFailsObserver);
		return rule;
	}

}
