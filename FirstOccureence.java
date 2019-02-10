
public class FirstOccureence {

	
	
		
		public static void main(String arhs[])
		{
			int arr[] = {1,20,20,20,30,30,30};
			int x = 20;
			int l=0;
			int n= arr.length;
			FirstOccureence ob = new FirstOccureence();
			int i= ob.binarySearch(arr,l,n,x);
			
			int k=ob.firstOcc(arr,l,i,x);
			//System.out.println(k);
			int m= ob.lastOcc(arr,l,i,x);
			
			int occ=m-k+1;
			System.out.println(occ);
			
			
			
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
			
			int firstOcc(int arr[],int l,int j,int x)
			{
				
				if(arr[j-1]!=arr[j])
				{
					return j;
				}
				return firstOcc(arr,l,j-1,x);
				
			}
			int lastOcc(int arr[],int l,int j,int x)
			{
				if(arr[j+1]!=arr[j])
				{
					return -1;
				}
				return lastOcc(arr,l,j,x);
			}

		

	}



	
	
