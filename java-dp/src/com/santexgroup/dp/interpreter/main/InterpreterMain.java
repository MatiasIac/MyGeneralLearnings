package com.santexgroup.dp.interpreter.main;

import com.santexgroup.dp.interpreter.model.InterpreterClient;
import com.santexgroup.dp.interpreter.model.InterpreterContext;

public class InterpreterMain {
	public static void main(String args[]) {
		final String str1 = "567 in Binary";
		final String str2 = "567 in Octal";
		String str3 = "567 in Hexadecimal";

		InterpreterClient ec = new InterpreterClient(new InterpreterContext());
		System.out.println(str1 + "= " + ec.interpret(str1));
		System.out.println(str2 + "= " + ec.interpret(str2));
		System.out.println(str3 + "= " + ec.interpret(str3));
	}
}
