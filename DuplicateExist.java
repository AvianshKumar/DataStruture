
import java.util.Arrays;

public class DuplicateExist {
	
	public static void main(String args[])
	{
		
		int arr[] = {3,1,3,2,3,4};
		
		Arrays.sort(arr);
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			int c =0;
			if(arr[i]==arr[i+1])
			{
				c++;
				
				//System.out.println("Duplicate Exsit");
			}
			System.out.println(c);
			
		
		}
		
		
	}

}
