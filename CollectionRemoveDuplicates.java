package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class CollectionRemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] str = text.split(",");
		
		Set<String>dup = new LinkedHashSet<String>();
		
		for (String dup1 : str) {
			
			dup.add(dup1);	
			
		}
		
         System.out.print(dup);
		
	}
	
			
		

	}


