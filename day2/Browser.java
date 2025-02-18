package week1.day2;

public class Browser {

	public static void main(String[] args) {
		
		Browser Br = new Browser();
		Br.launchBrowser();
		Br.loadUrl();		
	}
		
	public void launchBrowser()
	{
		System.out.println("Browser launched successfully");
	}
	
	public void  loadUrl()
	{
		System.out.println("Application URL loaded successfully");
	}

}
