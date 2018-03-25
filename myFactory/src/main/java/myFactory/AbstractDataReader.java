package myFactory;

public abstract class AbstractDataReader {
	abstract AbstractDataReader create(int formatId);
	abstract String read();
}
