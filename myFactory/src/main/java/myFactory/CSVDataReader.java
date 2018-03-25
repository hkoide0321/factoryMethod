package myFactory;

public class CSVDataReader extends AbstractDataReader {

	@Override
	AbstractDataReader create(int formatId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	String read() {
		return "this is csv";
	}

}
