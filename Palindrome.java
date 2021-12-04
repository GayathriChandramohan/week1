package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String A = "madamm";
		String Rev="";
		
		int len=A.length();
		
		
		for(int i=len-1; i>=0;i--)
		{
			Rev = Rev + A.charAt(i);
			
		}
		 if(A.equals(Rev))
		 {
			 System.out.println("Given sstring is palindrome");
		 }
		 else
		 {
			 System.out.println("Given sstring is a not palindrome");
		 }

	}

}
