package model.proxy;

public class Client {

	public void analyze(String region, String content) {
		AnalyzerProxy proxy = new AnalyzerProxy();
		proxy.analyze(region, content);
	}

}
