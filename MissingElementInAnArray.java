package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array	
		Arrays.sort(arr);
		int j = 1;
		// loop through the array (start i from arr[0] till the length of the array)
		for(int i = arr[0] ; i < arr.length ; i++)
		{
			// check if the iterator variable is not equal to the array values respectively
				if(j != arr[i - 1])
				{
					// print the number
					System.out.println("Missing number is "+ j);
					// once printed break the iteration
					break;
				}
			j++;
		}
				
	}

}
