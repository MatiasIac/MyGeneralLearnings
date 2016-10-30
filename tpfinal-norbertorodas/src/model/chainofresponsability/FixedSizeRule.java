package model.chainofresponsability;

import model.factorymethod.Rule;

/**
 * Represents a rule which validates the lenght of given content
 * @author beto
 *
 */
public class FixedSizeRule extends Rule {

	private int fixedSize;

	public FixedSizeRule(int fixedSize) {
		this.fixedSize = fixedSize;
	}

	@Override
	public void handle(String content) {
		//checking the fixed size preconfigured
		if (content.length() != fixedSize) {
			//Generating a proper message 
			setCauseFailMessage("The content '" + content
					+ "' doesn't have a correct size (actual: "
					+ content.length() + " - expected: " + fixedSize + ")");
			//Mark as false 
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
		return "fixed size";
	}

}
