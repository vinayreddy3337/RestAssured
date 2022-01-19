public class vinay2
{
int temp, size;
  int array[]= {10,20,30,50,90};
  size=array.length;
  for(int i=0;i<size;i++) {
  
	for(int j=i+1;j<size;j++) 
  {
		if(array[i]>array[j])
    {
			temp=array[i];
		    array[i]=array[j];
		    array[j]=temp;
		}    
	}
		    
	}

System.out.print("highest number"+array[size-1]);	  
	  
	  
	}

}
