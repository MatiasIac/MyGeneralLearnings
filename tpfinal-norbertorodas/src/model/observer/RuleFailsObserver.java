package model.observer;

import model.factorymethod.Rule;

/**
 * Observer implementation which logs data received when a rule validator fails
 * 
 * @author beto
 *
 */
public class RuleFailsObserver implements Observer {

	@Override
	public void update(Subject subject) {
		final Rule rule = (Rule) subject;

		if (rule.getCauseFailMessage() != null) {

			System.out.println("\n#### New Rule Fail has arrived! ####");
			System.out.println("\tRule: '" + rule.getName()
					+ "' - Description: '" + rule.getCauseFailMessage());
		}
	}
}
