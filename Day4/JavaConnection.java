package week2.Day4;

public class JavaConnection extends Abstractclasstest{

	

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.executeUpdate();
		DatabaseConnection.executeUpdate();
		jc.disconnect();
//		DatabaseConnection.super.disconnect();
		
	}

	private void executeUpdate() {
		System.out.println("Executed Data in DB from Concrete class");
	}
}
