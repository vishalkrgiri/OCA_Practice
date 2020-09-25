package day3;

public class Ex6 {
	public static void print(String s) 
	{	 
		System.out.println("String"); 
	} 
	public static void print(Object o) 
	{ 
		System.out.println("Object"); 
	} 
	public static void print(Integer i) 
	{ 
		System.out.println("Integer"); 
	} 

	public static void main(String[] args)
	{
		print(null); //ambiguous as both Integer and String are same specific
	}

}
