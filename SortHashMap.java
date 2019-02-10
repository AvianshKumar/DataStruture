	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.HashMap;
	//import java.util.Set;
	
	public class SortHashMap {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
			h.put(0,1);
			h.put(1,0);
			h.put(2, 3);
			h.put(3, 2);
			Collection<Integer> s = h.values();
			ArrayList<Integer> al = new ArrayList<Integer>(s);
			Integer[] arr = new Integer[al.size()]; 
	        arr = al.toArray(arr);
	        Arrays.sort(arr,Collections.reverseOrder());
			for(int i : arr)
			{
				System.out.println(i);
			}
		/*Integer[] arr = new Integer[al.size()]; 
        arr = al.toArray(arr);
        Integer[] arr1= new Integer[al.size()];
        
        arr1=arr.toCharArray();
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }*/
		
		
		
	}

}
