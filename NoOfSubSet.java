
public class NoOfSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//refer link:-https://java2blog.com/find-subsets-set-power-set/
		int arr[]= {1,2,3};
		int n = arr.length;
		for(int i=0;i< (1<<n);i++)
		{
			System.out.print("{");
			int m=1;
			for(int j=0;j<n;j++)
			{
				if((i&m)>0)
				{
					System.out.print(arr[j]+" ");
					
				}
				m=m<<1;
			}
			System.out.print("}");
			
		}
		
		
	}

}
