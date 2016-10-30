package model.chainofresponsability;

import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;

/**
 * Rule which ensure that given characters are formed by numeric digis
 * @author beto
 *
 */
public class OnlyNumberRule extends Rule {

	private static final String REGEX = "[0-9]+";

	@Override
	public void handle(String content) {
		if (!hasOnlyDigits(content)) {
			setCauseFailMessage("The content '" + content + "' is not a number");
			setValid(false);
			notifyObservers();
		} else {
			setValid(true);
			notifyObservers();
			moveToNext(content);
		}

	}

	private boolean hasOnlyDigits(String content) {
		return (content.matches(REGEX));
	}

	@Override
	public String getName() {
		return RuleCreator.ONLY_NUMBER;
	}

}
