package com.santexgroup.dp.chainofresponsability.model;

public class BigContentHandler implements Handler {

	private Handler next;

	public Handler getNext() {
		return next;
	}

	@Override
	public void setNext(Handler handler) {
		next = handler;
	}

	@Override
	public void handle(String input) {
		if (input.length() > 40) {
			System.out.println("Handling a big content: " + input.length() + " characters");
		} else {
			next.handle(input);
		}

	}

}
