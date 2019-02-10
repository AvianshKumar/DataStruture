
public class FindSingleElement {
	public static void main(String args[])
	{
	int arr[]= {1,1,2,2,3,3,4,5,5};
	int missingNum = arr[0];
	
	for(int i = 1;i<arr.length;i++)
	{
		missingNum^=arr[i];
	}
	System.out.println(missingNum);
}
}
