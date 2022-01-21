public class Vinay2
{
  
	public static void main(String[] args) 
  {
    // to find the missing  elements from another array
		int [] marks1= {3,5,8,4,6};
		int [] marks2= {3,5,4,6};
		int sum1=0;
		int sum2=0;
		int missing;
    //using for loop for iteration
		for(int i=0;i<marks1.length;i++) 
    {
			 sum1=sum1+marks1[i];
		}
    
		for(int j=0;j<marks2.length;j++)
    {
			sum2=sum2+marks2[j];	
		}
    
		missing=sum1-sum2;
		System.out.println(missing);
	}

}
