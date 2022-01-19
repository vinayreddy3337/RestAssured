class Vinay1 {

	    public static int getMissingNumber(int[] arr)
	    {
	        
	    	int size=arr.length;
	    	int m=size+1;
	    	int total= m*(m+1)/2;
	    	int sum=0;
	    	for(int i=0;i<size;i++) {
	    		sum=sum+arr[i];
	    	}
	    	return total- sum;
	    	
	    	
	    }
	    public static void main(String[] args)
	    {
	        int[] arr= { 1,2,3,5};
	    
	        System.out.println("The missing number is " + getMissingNumber(arr));
	    }
		}
