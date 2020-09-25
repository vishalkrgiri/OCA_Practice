package day3;

public class Ex5 {

	 public static void print(String s) 
	    {     
	        System.out.println("String"); 
	    } 
	    public static void print(Object o) 
	    { 
	        System.out.println("Object"); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        print(null); 
	    } 
	    //String will be printed as compiler choose more specific method.
}
