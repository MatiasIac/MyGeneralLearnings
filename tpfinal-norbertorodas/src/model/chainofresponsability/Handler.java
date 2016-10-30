package model.chainofresponsability;

/**
 * Handler of pattern chain of responsability
 * 
 * @author beto
 *
 */
public interface Handler {
	void setNext(Handler handler);

	Handler getNext();

	void handle(String content);

}
