
public abstract class ChainBase {
	private ChainBase next_element;
	
	public ChainBase getNext() {
		return next_element;
	}
	
	public void setNext(ChainBase chain) {
		next_element = chain;
	}
	
	public void MoveOn(String data) {
		if (next_element != null) {
			try {
				next_element.Process(data);
			} catch (Exception e) {
				System.out.print("Error");
			}
		}
	}
	
	public abstract void Process(String data) throws Exception;
	
}