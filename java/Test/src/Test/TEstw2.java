package Test;

import java.util.*;

public class TEstw2 {

	public static void main(String[] args) {
		

	    ArrayList<Integer> al=new ArrayList<>();    
        al.add(Integer.valueOf(201));    
        al.add(Integer.valueOf(101));    
        al.add(230);//internally will be converted into objects as Integer.valueOf(230)    
        Collections.sort(al);           
        Iterator<Integer> itr=al.iterator();    
        while(itr.hasNext()){    
            System.out.println(itr.next());    
			}

		
	}

	}


