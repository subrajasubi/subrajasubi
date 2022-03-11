package javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {

		int array[]= {1,3,3,3,3,5,6,6,7,7,7};
		System.out.println("Arrays without duplicate : ");
        Set<Integer> duplicate = new LinkedHashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
			duplicate.add(array[i]);
			
		}
        System.out.println(duplicate);
        

	}

}
