package com.santexgroup.dp.interpreter.model;

public class InterpreterContext {

	public String getBinaryFormat(int number) {
		return Integer.toBinaryString(number);
	}

	public String getOctalFormat(int number) {
		return Integer.toOctalString(number);
	}

	public String getHexaFormat(int number) {
		return Integer.toHexString(number);
	}

}
