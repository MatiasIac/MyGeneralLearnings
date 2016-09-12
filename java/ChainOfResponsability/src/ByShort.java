
public class ByShort extends ChainBase {

	@Override
	public void Process(String data) throws Exception {
		if (data.length() > 15) {
			System.out.print("Error: By Short");
            throw new Exception();
		}

        super.MoveOn(data);
	}
}