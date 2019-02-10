
public class MaximumTimesRepeation {

	public static void main(String args[])
	{
	
	int arr[] = {1,2,2,3,3,3,4,5};
	int n = arr.length;
	int count=1;
	int max=0;
	
	
	
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		if(arr[i]==arr[j])
		{
			count++;
			
		}
	}
		
}
		
		if(count>max)
		{
			max=count;
		}
			
	
	
	System.out.println(max);
	
	}
	
	
}
