
public class BooleanMatrix {
	public static void main(String args[])
	{
		int arr[][]= {{1,0,0},
				{0,0,0}};
		BooleanMatrix ab = new BooleanMatrix();
		
   ab.printArr(arr,2,3);
   ab.modifyArr(arr,2,3);
   ab.printArr(arr,2,3);
		
		}
	
	void printArr(int arr[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	
	void modifyArr(int arr[][],int m,int n)
	{
		int row[] = new int[m];
		int col[] = new int[n];
		for(int i=0;i<m;i++)
		{
			row[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			col[i]=0;
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
			if(arr[i][j]==1)
			{
				row[i]=1;
				col[j]=1;
				
			}
				
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
		       if((row[i]==1)||(col[j]==1))
               {
	          
		    	   arr[i][j]=1;
		    	   
		    	   
                }
			}
		}
	}
	
	
	}


