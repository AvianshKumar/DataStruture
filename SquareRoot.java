
public class SquareRoot {
	
	public static void main(String arhs[])
	{
		int arr[] = {1,20,20,20,30,30,30};
        int x = 20;
		int l=1;
		int n= arr.length;
		SquareRoot sq = new SquareRoot();
		int i = sq.squareRoot(arr,l,n,x);
		System.out.println(i);
	}
	

	
	
	int squareRoot(int arr[],int l,int n,int x)
	{
		
		int mid = l+n/2;
		if((mid*mid==x)|| (mid*mid<x)&&(mid+1)*(mid+1)>x)
		{
			return mid;
		}
		else if(mid*mid>x)
		{
			return squareRoot(arr,l,mid,x);
		}
		else if(mid*mid<x)
		{
			return squareRoot(arr,mid+1,n,x);
			
		}
		else {
			return -1;
		}
	}

}
