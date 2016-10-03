package com.santexgroup.dp.proxy.model;

public class Document implements IDocument {

	@Override
	public void login(String user) {
		System.out.println("Opening a document");
	}

	@Override
	public void loadImage(Integer page) {
		System.out.println("Loading image page: " + page);
	}

}
