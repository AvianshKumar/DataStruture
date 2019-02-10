
public class LengthOfRope {
public static void main(String ags[])
  {
	int n=10;
	int a=1,b=2,c=3;
	LengthOfRope lb = new LengthOfRope();
		int lengthofroop =	lb.ropeRecursive(n,a,b,c);
		System.out.println(lenghtofroop);	
	
	
  }



    
 int ropeRecursive(int n, int a, int b, int c) {
	// TODO Auto-generated method stub
	if(n==0){
		return 0;
	}
	else if (n<0){
		return -1;
	}
	int xa = ropeRecursive(n-a,a,b,c);
	int xb = ropeRecursive(n-b,a,b,c);
	int xc = ropeRecursive(n-c,a,b,c);
	if(xa==-1 && xb == -1 && xc==-1){
		return -1;
	}
	 return 1+ max(xa,xb,xc);
}
      
     int max(int a1,int b1,int c1)
     {
    	 if((a1>b1)&&(a1>c1))
    	 {
    		 return a1;
    	 }
    	 else if(b1>c1)
    	 {
    		 return b1;
    	 }
    	 else {
    		 return c1;
    	 }
     }
 
 }
