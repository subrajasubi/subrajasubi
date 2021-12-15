package week3.day1.assignments;

public class FindTyppesString {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char [] ch =  test.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isLetter(i)) {
				
				System.out.println("Letter :" +letter);
				
			}
			
			if(Character.isDigit(i)) {
				
				System.out.println("Digit : " +space);
			}
			
			if(Character.isSpaceChar(i)) {
				
				System.out.println("Number :"  +num);
			}
			else {
				
				
			}
		}System.out.println("Special character : " +specialChar);


	}

}
