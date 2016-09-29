package com.santexgroup.dp.chainofresponsability.model;

public class Client implements Handler {

	private Handler next;

	@Override
	public void setNext(Handler handler) {
		next = handler;
	}

	@Override
	public Handler getNext() {
		return next;
	}

	@Override
	public void handle(String content) {
		SmallContentHandler smallContentHandler = new SmallContentHandler();
		this.setNext(smallContentHandler);

		MediumContentHandler mediumContentHandler = new MediumContentHandler();
		smallContentHandler.setNext(mediumContentHandler);

		BigContentHandler bigContentHandler = new BigContentHandler();
		mediumContentHandler.setNext(bigContentHandler);

		next.handle(content);
	}

}
