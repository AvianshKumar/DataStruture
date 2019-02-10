import java.util.Arrays;

public class OddNumberOccuring {
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,1,2,3,2};
		//[1,1,2,2,2,3,3]
		
		 int n=arr.length;
		 Arrays.sort(arr);
		 

		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
			if(arr[i]==arr[j])
			{
				c++;
			}
			

			
		}
			System.out.println("the count is"+c +" "+"element is"+arr[i]);
			
			                
	}
}

 

}

