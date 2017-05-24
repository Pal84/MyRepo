import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		Set<String> str = new HashSet<String>();
		str.add("Ravi");
		str.add("Hema");  
		str.add("Prabu");  
		str.add("Kala"); 
	    System.out.println(str); 
	    Iterator<String> itr=str.iterator(); 
	    while(itr.hasNext()){  
	    	  // System.out.println(itr.next());  
	    	  // String temp=itr.next();
	    	   if(itr.next().length()==2)
	    	   {
	    		   str.add("Divi");
	    	   }
	    	   System.out.println(str); 
	    	   

	}
	    
	}
}
