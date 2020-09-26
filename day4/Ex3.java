package day4;


public class Ex3 {

	public static void main(String[] args) 
	{	
		String s="-";
		switch("Red".toLowerCase())
		{
			case "yellow":
				s+="y";
			case "red":
				s+="r";
			case "green":
				s+="g";
		}
		System.out.println(s);
	}

}
