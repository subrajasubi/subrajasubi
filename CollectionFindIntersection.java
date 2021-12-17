package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionFindIntersection {

	public static void main(String[] args) {

              int[] arr1 = {3,2,11,4,6,7};
              
              int[] arr2 = {1,2,8,4,9,7};
              
              Set<Integer>num1 = new  LinkedHashSet<Integer>();
              
              Set<Integer>num2 = new LinkedHashSet<Integer>();
            
              if(arr1.length==arr2.length) 
              {  
            	  
              
            for (int i = 0; i < arr2.length; i++) {
            	
            	num2.add(arr2[i]);
            	
            	num1.add(arr1[i]);
            }
            
       num1.retainAll(num2);
       
       System.out.println("Common Numbers : " +num1);
       
       num2.removeAll(num1);
       
       System.out.println("Uncommon numbers : " +num2);
	}
		
		
					
            		
					
				}
			}
            	  

	

	
