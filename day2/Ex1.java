package day2;

public class Ex1 {
	private char var;
	public static void main(String[] args)
	{
		char var1='a';
		char var2='e';
		
		Ex1 obj1 = new Ex1();
		Ex1 obj2=obj1;
		obj1.var='i';
		obj2.var='o';
		
		System.out.println(var1+" , "+var2);
		System.out.println(obj1.var+" , "+obj2.var);
	}

}
