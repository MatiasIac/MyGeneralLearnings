package com.santexgroup.dp.interpreter.model;

public class IntegerToBinaryExpression implements Expression {

	private int number;

	public IntegerToBinaryExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getBinaryFormat(this.number);
	}

}
