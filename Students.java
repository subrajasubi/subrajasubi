package week3.day1.assignments;

public class Students {
	
	public void getStudentsInfo(int id) {
		
		System.out.println(id);
		
	}
	
	public void getStudentsInfo(int id,String name) {
		
		System.out.println(id+" "+name);
	}

	
	public void getStudentsInfo(String email, long phonenumber) {
		
		System.out.println(email+" " + phonenumber);
	}
	
	public static void main(String[] args) {
		
		Students st = new Students();
		st.getStudentsInfo(1550 , "subraja");
		st.getStudentsInfo("subi@gmail.com", 4578);
		st.getStudentsInfo( 18448548);
		
		
		
		
	}
	
	
	
	
	
	
	
}
