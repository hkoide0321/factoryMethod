package myFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractDataReader reader = null;
SimpleFactory factory = new SimpleFactory();
reader = factory.create(1); 
String data = reader.read();
System.out.println("done.");
System.out.println("type = " + data);
	}

}
 