package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionMissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer>missing = new ArrayList<Integer>();
		
        for (Integer mis1 : arr) {
        	
        	missing.add(mis1);
			
		} 
        System.out.println("Given String" +missing);
       	
		Integer num = missing.get(missing.size()-1);
		
		for (int i = 1; i < num; i++) {
			
			if(!missing.contains(i)) {
				
				System.out.println("missing element:" +i);
			}
			
			
			
		}
	}	
			
			}
