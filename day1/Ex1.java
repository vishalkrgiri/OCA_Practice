package day1;

//String objects are immutable.
public class Ex1 {

	public static void main(String[] args)
	{
		String s = "java2s"; 
        s.replace('a', 'Z').trim().concat("Aa"); 
        s.substring(0, 2); 
        System.out.println(s); 
	}

}
