
public class MissingNum {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,5,6,7};
		int n = arr.length;
		int j=1;
		int total = (n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			total=total-arr[i];
				
		}
		System.out.println(total);
	}
	
	
}
