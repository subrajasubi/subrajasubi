package week1.day2.assignments;


public class StringPalindrome {
	
	
	public static void main(String[] args) {
		
		String str = "madam";
		
		String rev = "";
		
		
		
		for (int i = 0; i < str.length(); i++) {
			
		rev = rev + str.charAt(i);
     
			
		}
		
		 System.out.println(rev);
		 System.out.println(str.equals(rev));
		 
		 if(str.equals(rev)){
			 System.out.println("The given name is palindrome");
		 }
		 else {
			 System.out.println("The given name is not a palindrome");
		 }
}
	
}
		
		
	

	
		
			
				
			
			
		
		
		
		
		
     
	
      
	


