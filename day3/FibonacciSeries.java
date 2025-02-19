package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range =10;
		int num=0,num1=1;
		System.out.println("Fibanocci series");
		System.out.println(num);
		System.out.println(num1);
		for(int i=1;i<range-1;i++)
		{
			int num2 = num + num1;
			num = num1;
			num1 = num2;
			System.out.println(num2);
			
		}

	}

}
