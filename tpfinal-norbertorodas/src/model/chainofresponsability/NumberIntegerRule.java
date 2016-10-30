package model.chainofresponsability;

import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;

/**
 * Represents a rule which ensure a given text is an integer number
 * 
 * @author beto
 *
 */
public class NumberIntegerRule extends Rule {

	@Override
	public void handle(String content) {
		// validating content as integer number
		if (!isInteger(content)) {
			// proper message
			setCauseFailMessage("The content '" + content
					+ "' is not a integer number");
			setValid(false);
			notifyObservers();
		} else {
			setValid(true);
			notifyObservers();
			moveToNext(content);
		}
	}

	/**
	 * Tries to parse a given string into a integer number
	 * 
	 * @param input
	 *            the given string
	 * @return true if is an integer number. Otherwise false
	 */
	private boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getName() {
		return RuleCreator.NUMBER_INTEGER;
	}

}
