package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to coimbatore";
		
		int count=0;
		
		int len = str.length();
		
		for(int i = len-1; i>=0; i-- )
	    //for(int i = 0; i<= len-1 ; i++ )

		{
			if(str.charAt(i)=='w')
			{
				count++;
			}
		}
		
		System.out.println("The CharOccurance count is : "+ count);

	}

}
