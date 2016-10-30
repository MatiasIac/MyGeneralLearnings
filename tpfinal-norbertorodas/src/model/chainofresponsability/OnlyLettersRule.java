package model.chainofresponsability;

import model.factorymethod.Rule;
import model.factorymethod.RuleCreator;

/**
 * Rule which ensures the content is only formed by letters
 * @author beto
 *
 */
public class OnlyLettersRule extends Rule {

	@Override
	public void handle(String content) {
		//validating
		final boolean hasOnlyLetters = hasOnlyLetters(content);
		if (!hasOnlyLetters) {
			setCauseFailMessage("The content '" + content
					+ "' doesn't have only letter characters");
			setValid(false);
			notifyObservers();
		} else {
			setValid(true);
			notifyObservers();
			moveToNext(content);
		}
	}

	private boolean hasOnlyLetters(String content) {
		//This sentences uses lambda expressions (java 8)
		return content.chars().allMatch(Character::isLetter);
	}

	@Override
	public String getName() {
		return RuleCreator.ONLY_LETTERS;
	}

}
