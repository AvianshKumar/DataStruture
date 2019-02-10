
public class MissingNumber {

	public static void main(String args[])
	{
		int found = 0;

	int arr[] = {5,6,7,9,10};
	int n = arr.length;
	
	int c=arr[0];
	for(int i=1;i<n;i++)
	{
				if(arr[i]==++c)
		{
			found = 1;
			
		}
		else 
		{
			System.out.println("The missing term is "+c);
			c++;
		}
		
	}
	
	}
	
	
}
