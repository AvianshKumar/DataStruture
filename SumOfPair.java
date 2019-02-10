import java.util.HashMap;
import java.util.Map;

public class SumOfPair {

	public static void main(String args[])
	{
		int arr[]= {1,10,20,30,40,45};
		int n= arr.length;
		int sum=60;
		SumOfPair sp = new SumOfPair();
		//sp.SumofPair(arr,n);
		sp.findPair(arr, sum);
		
	}
	
	 //T.C=O(1)
	
	public  void findPair(int[] A, int sum)
	{
		// create an empty Hash Map
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < A.length; i++)
		{
			// check if pair (arr[i], sum-arr[i]) exists

			// if difference is seen before, print the pair
			if (map.containsKey(sum - A[i]))
			{
				System.out.println("Pair found at index " +
								   map.get(sum - A[i]) + " and " + i);
				return;
			}

			// store index of current element in the map
			map.put(A[i], i);
		}

		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}

	// Find pair with given sum in the array
	
	
	/*void SumofPair(int arr[],int n)
	{
		int x =60;
		int l=0;
		int r=n-1;
		
		//T.C O(n)
		while(l<r)
		{
			if(arr[l]+arr[r]==x)
			{
				System.out.println("there is a pair  "+arr[l] +" "+arr[r]+" "+"with sum of "+x);
				return;
			}
			else if(arr[l]+arr[r]>x)
			{
				r--;
			}
			else {
				l++;
			}
		}
	}*/
	
}
	//T.C=O(n2)	
	/*for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j]==x)
			{
				System.out.println("there is a pair  "+arr[i] +" "+arr[j]+" "+"with sum of "+x);
			}
		}
	}*/
	


