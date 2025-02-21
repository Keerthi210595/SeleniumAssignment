package week1.day4;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TO find missing element in below array
		int[] arr = {1,4,3,2,8,6,7};
		Arrays.sort(arr);
//		System.out.println(arr[1]);
		
		for (int i = 0; i <= arr.length-1; i++) {
//			System.out.println(arr[i]);
			if(arr[i]== i+1)
			{
				System.out.println(arr[i]);
			}
			else {
				System.out.println(i+1 +" is missing in series");
				break;
			}
						
		}
		
		

	}

}
