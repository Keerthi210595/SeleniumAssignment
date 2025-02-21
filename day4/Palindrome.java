package week1.day4;

public class Palindrome {
	
	public static int reverseNum(int n)
	{
		int revNum = 0;
		//reverse the number digit by digit.
		while(n>0){
			revNum = revNum*10 + n%10;	//*10 will move the loop to next digit. %10 will add the reminder to number	 	
			n = n/10;		
		}
		return revNum;
	}

	public static void main(String[] args) {
		
		int input = 12321;
		int output = reverseNum(input);	
		
		if(input == output)
		{
			System.out.println("Number "+input+" is palindrome");
		}
		else
		{
			System.out.println("Number "+input+" is not a palindorme");
		}
		
		
		
	}

}
