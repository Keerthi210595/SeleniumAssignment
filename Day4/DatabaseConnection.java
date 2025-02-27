package week2.Day4;

public interface DatabaseConnection {
	
	public void connect();
	
	default void disconnect() {
		System.out.println("Disconnected from Interface using Default Keyword");
	}
	
	static void executeUpdate() {
		System.out.println("Executed Data update in DB from Interface - using static method");
	}
	

}
