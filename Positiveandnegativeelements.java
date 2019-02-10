
public class Positiveandnegativeelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {-1,2,-3,4,-5,6};
		int n= arr.length;
		int i=0;
		while(i<n)
		{
			if(arr[i]<0)
			{
			 int temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
			 System.out.println(arr[i]+arr[i+1]);
			}
			 i=i+2;
			
		}
		
	}

}
