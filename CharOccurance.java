package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int count=0;
		
		int strLen = str.length();
		
		for (int i = 0; i < strLen; i++) {
			
			if (str.charAt(i) == 'e') 
				
			count++;
				
		}	
				
				
				System.out.println(count);
			}
		}
		

	
	

