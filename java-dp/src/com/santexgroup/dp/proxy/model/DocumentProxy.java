package com.santexgroup.dp.proxy.model;

public class DocumentProxy implements IDocument {

	private Document document = new Document();

	@Override
	public void login(String user) {
		if (user.isEmpty()) {
			System.out.println("User without permissions");
		} else {
			document.login(user);
		}

	}

	@Override
	public void loadImage(Integer page) {
		if (2 != page) {
			System.out.println("The image will be loaded after");
		} else {
			document.loadImage(page);
		}
	}

}
