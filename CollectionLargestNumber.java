package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionLargestNumber {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		List<Integer>Ln = new ArrayList<Integer>();
		
		
		for (Integer d : data) {
			
			Ln.add(d);
			
		}
		Collections.sort(Ln);
		
		System.out.println(Ln);
		
		System.out.println("Second Largest Number :" +Ln.get(Ln.size()-2));
		
		}
	

	}


