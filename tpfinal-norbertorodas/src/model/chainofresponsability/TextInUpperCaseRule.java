package model.chainofresponsability;

import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;

/**
 * Rule to validate if a text is fully uppercase
 * @author beto
 *
 */
public class TextInUpperCaseRule extends Rule {

	@Override
	public void handle(String content) {
		final String contentUpperCase = content.toUpperCase();
		if (!content.equals(contentUpperCase)) {
			setCauseFailMessage("The content '" + content
					+ "' is not fully uppercase");
			setValid(false);
			notifyObservers();
		} else {
			setValid(true);
			notifyObservers();
			moveToNext(content);
		}

	}

	@Override
	public String getName() {
		return RuleCreator.TEXT_IN_UPPERCASE;
	}

}
