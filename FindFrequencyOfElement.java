import java.util.Arrays;
import java.util.LinkedHashMap;

public class FindFrequencyOfElement {

	
	public static void main(String args[])
	{
		Integer arr[] = { 10,5,10,10,20,5,20 };
		int n = arr.length;
		//LinkedHasMap<Integer,Integer> lhm = new LinkedHasMap<Integer,Integer>();
		LinkedHashMap<Integer, String> li_hash_map = 
				new LinkedHashMap<Integer, String>();
		for(int i=0;i<n;i++)
		{
			li_hash_map.put(i, arr[i]);
		}
		
	}
}
