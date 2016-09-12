public class Program {

	public static void main(String[] args) {
		
		ChainBase chain = new ByLong();
		chain.setNext(new ByShort());
		
		try {
			chain.Process("Test");
		} catch (Exception e) {
			System.out.print("Error");
		}
		
		System.out.print("End of program");
	}
}