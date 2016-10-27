package model;

public interface Handler {
	void setNext(Handler handler);

	Handler getNext();

	void handle(String content);

}
