package model.interpreter;

import model.factorymethod.Rule;

/**
 * Represents an expression as part of the Interpreter pattern. It's associated
 * with rules (chain of responsability)
 * 
 * @author beto
 *
 */
public interface Expression {

	void interpret(InterpreterContext interpreterContext);

	/**
	 * Returns a reference of rules validation configured
	 * 
	 * @return
	 */
	Rule getRule();

}
