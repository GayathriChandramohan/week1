package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		int i;
		int j;
		
		int arrayLen =arr.length;
	
		
		for( i=0; i<=arrayLen-1;i++ )
		{
			count=0;
			
			for( j=i+1; j<=arrayLen-1; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count>0)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		

	}

}
