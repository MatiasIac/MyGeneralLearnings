package com.santexgroup.dp.interpreter.model;

public class InterpreterClient {
	public InterpreterContext interpreterContext;

	public InterpreterClient(InterpreterContext interpreterContext) {
		this.interpreterContext = interpreterContext;
	}

	public String interpret(String str) {
		Expression exp = null;
		// create rules for expressions
		if (str.contains("Hexadecimal")) {
			exp = new IntegerToHexaExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntegerToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Octal")) {
			exp = new IntegerToOctalExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else
			return str;

		return exp.interpret(interpreterContext);
	}
}
