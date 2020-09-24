package day2;

class A{
	void print()
	{
		System.out.println("A");
	}
}
class B extends A{
	void print()
	{
		System.out.println("B");
	}
}
public class Ex2 {

	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		a.print();
		b.print();
		A c=(B)b;
		c.print();
	}

}
