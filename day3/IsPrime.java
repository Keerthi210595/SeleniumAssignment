package week1.day3;

public class IsPrime {

	public static void main(String[] args) {
		
		int a =13, flag =0;
		
			for(int i=2;i<a-1;i++)
			{
				if(a%i==0) {
					//System.out.println("Number "+a+" is not a prime number");
					flag = 1;
					break;
					}
				
			}
			
			if (flag == 0) 
			{
				System.out.println("Number "+a+" is a prime number");
				}
			else 
			{
				System.out.println("Number "+a+" is not a prime number");
				}
		}

}
