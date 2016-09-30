package com.santexgroup.dp.interpreter.model;

public class IntegerToHexaExpression implements Expression {

	private int number;

	public IntegerToHexaExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getOctalFormat(this.number);
	}

}
