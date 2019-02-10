
public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,3,1,5,6,8,1,2};
		
		int a= arr[0]*arr[2];
		int b= arr[1]*arr[3];
		int c= arr[4]*arr[6];
		int d= arr[5]*arr[7];
		int mult=a*b*c*d;
		System.out.println(mult);
		int div=mult/4;
		if(div%2==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}


