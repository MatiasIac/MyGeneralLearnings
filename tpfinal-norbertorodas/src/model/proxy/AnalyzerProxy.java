package model.proxy;

import model.interpreter.InterpreterClient;

public class AnalyzerProxy implements IAnalyzer {

	private final static String MERCOSUR = "mercosur";

	private InterpreterClient client = new InterpreterClient();

	@Override
	public void analyze(String region, String input) {
		if (!region.equals(MERCOSUR)) {
			System.out.println("Task rejected: " + region
					+ " is not allowed (permited: " + MERCOSUR + ")");
		} else {
			final String trimmed = input.trim();
			client.analyze(region, trimmed);
		}
	}
}
