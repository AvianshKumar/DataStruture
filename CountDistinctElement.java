
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {

	
	public static void main(String args[])
	{
				
		//Integer arr[] = { 10,20,10,30,20 }; 
		  
		ArrayList<Integer> arrli = new ArrayList<Integer>(Arrays.asList(10,20,10,30,20));
		Set<Integer> set = new HashSet<>(arrli); 
		
		
		//Set<Integer> set = new HashSet<>(Arrays.asList(arr)); 
		System.out.println(set); 
		System.out.println(set.size());
		
		
	}
	
	
	
	
}
