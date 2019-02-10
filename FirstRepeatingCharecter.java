
public class FirstRepeatingCharecter {

	public static void main(String args[])
	{
		int c=0;
		String str="geeksforgeeks";
		char ch[]=str.toCharArray();
		for(char cha='a';cha<='z';cha++)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(cha==ch[i])
				{
					c++;
				}
				if(c>2)
				{
					System.out.println(ch[i]);
				}
			}
		}
	}
}
