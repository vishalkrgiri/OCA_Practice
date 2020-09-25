package day3;

class Point { 
    protected int x, y; 
  
    public Point(int _x, int _y) 
    { 
        x = _x; 
        y = _y; 
    } 
} 

public class Ex3 {

	public static void main(String[] args) {

		Point p = new Point(); //No default constructor, that's why compile time error.
        System.out.println("x = " + p.x + ", y = " + p.y); 

	}

}
