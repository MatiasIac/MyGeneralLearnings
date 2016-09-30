package com.santexgroup.dp.interpreter.model;

public class IntegerToOctalExpression implements Expression {

	private int number;

	public IntegerToOctalExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getHexaFormat(this.number);
	}

}
