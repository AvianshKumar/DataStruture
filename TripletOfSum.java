import java.util.Arrays;

public class TripletOfSum {
	public static void main(String args[])
	{
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
        int sum = 22; 
        int arr_size = A.length; 
        Arrays.sort(A);

	for (int i = 0; i < arr_size - 2; i++) { 
		  
         
        int l = i + 1; 
        int r = arr_size - 1; 
        while (l < r) { 
            if (A[i] + A[l] + A[r] == sum) { 
                System.out.print("Triplet is " + A[i] + 
                             ", " + A[l] + ", " + A[r]); 
                
            } 
            else if (A[i] + A[l] + A[r] < sum) 
                l++; 

            else // A[i] + A[l] + A[r] > sum 
                r--; 
        } 
	}
    

    System.out.println("No triplet found"); 
    
  } 
	
	
}
