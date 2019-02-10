
public class RecursionNumber {

	public static void main(String args[])
	{
		int i =1;
		int n=5;
		RecursionNumber r=new RecursionNumber();
		int a= r.Number(i,n);
	}
	
	int Number(int i,int n)
	{
	if(i<=n) {
	Number(i,n);
	return i;
	}
	i++;
	n--;
	}
}