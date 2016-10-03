package com.santexgroup.dp.proxy.model;

public class Client {

	public void loginToDocument(String user) {
		DocumentProxy proxy = new DocumentProxy();
		proxy.login(user);
		proxy.loadImage(1);
	}
}
