package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String txt1 = "stop";
		String txt2 = "pots";
		int len1 = txt1.length();
		int len2 = txt1.length();
		
				
		if(len1 == len2)
		{
			char[] a = txt1.toCharArray();
			char[] b = txt2.toCharArray();
			Arrays.sort(a);
		    System.out.println(a);
			Arrays.sort(b);
			System.out.println(b);
			if (Arrays.equals(a,b))
			{
				System.out.println("Given string is a Anagram");
			}
			else
			{
				System.out.println("Given string is not a Anagram");
			}
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
	}

}
