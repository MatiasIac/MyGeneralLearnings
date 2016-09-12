
public class ByLong extends ChainBase {

	@Override
	public void Process(String data) throws Exception {
		
		if (data.length() < 4) {
			System.out.print("Error: By Long");
            throw new Exception();
		}

        super.MoveOn(data);
	}

}