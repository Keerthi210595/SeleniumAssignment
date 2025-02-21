package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String companyName= "TestLeaf";
		char[] s= companyName.toCharArray();
		
		for(int i=companyName.length()-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}
		
	}

}
