package day2;

public class Ex3 {
	int x,y;
	
	public Ex3(int x, int y)
	{
		initialize(x,y);
	}
	
	public void initialize(int x, int y)
	{
		this.x=x*x;
		this.y=y*y;
	}
	
	public static void main(String[] args) {
			int x=3,y=5;
			Ex3 obj = new Ex3(x,y);
			System.out.println(x+" "+y);
	}

}
