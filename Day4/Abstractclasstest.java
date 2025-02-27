package week2.Day4;

public abstract class Abstractclasstest implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connect() {
		System.out.println("Connected from Abstract class");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		DatabaseConnection.super.disconnect();
	}

	//will this give the list of unimplemented methods to implement?

}
