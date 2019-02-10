
public class Binarysearch {
	
	public static void main(String arhs[])
	{
		int arr[] = {3,4,7,8,10,15,25};
		int x = 25;
		int l=0;
		int n= arr.length;
		Binarysearch ob = new Binarysearch();
		int i= ob.binarySearch(arr,l,n,x);
		System.out.println(i);
		
	}
		
		int binarySearch(int arr[],int l,int n,int x)
		{
		int mid = l+n/2;
		
		if(arr[mid]==x)
		{
			return mid;
			
		}
		else if(arr[mid]>x)
		{
			
			return binarySearch(arr,l,mid-1,x);
			
		}
		else if(arr[mid]<x)
		{
			return binarySearch(arr,mid,n,x);
		}
		else {
			return -1;
		}
		
		
		
		
	}

	

}

