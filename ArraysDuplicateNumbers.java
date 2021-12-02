package week1.day2.assignments;

import java.util.Arrays;

public class ArraysDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		System.out.println("The missing elements are");
		
		
		for (int i = 0; i < arr.length; i++) {
			
			Arrays.sort(arr);
			
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i] == arr[j]) {
			
				System.out.println(arr[j]);
		}	
		
						
	}

			
}	
}
}	
		
	

	


