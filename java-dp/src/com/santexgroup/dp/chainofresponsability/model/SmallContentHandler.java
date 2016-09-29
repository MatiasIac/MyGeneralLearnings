package com.santexgroup.dp.chainofresponsability.model;

public class SmallContentHandler implements Handler {

	private Handler next;

	public Handler getNext() {
		return next;
	}

	@Override
	public void setNext(Handler handler) {
		next = handler;
	}

	@Override
	public void handle(String content) {
		if (content.length() <= 20) {
			System.out.println("Handling an small content: " + content.length() + " characters");
		} else {
			next.handle(content);
		}

	}

}
