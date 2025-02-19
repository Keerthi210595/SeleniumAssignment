package week1.day3;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			int a;
			a = i%2;
			if(a==0)
			{
				System.out.println("Number "+i+" is Even");
			}
			else
			{
				System.out.println("Number "+i+" is Odd");
			}
		}
	}

}
