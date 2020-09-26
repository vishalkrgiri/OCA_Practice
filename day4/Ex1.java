package day4;

class Rocket
{
	private void blastOff()
	{
		System.out.print("bang");
	}
}

public class Ex1 extends Rocket{

	public static void main(String[] args)
	{
		new Ex1().go();
	}
	void go()
	{
		blastOff();
		//Rocket.blastOff();
	}
	private void blastOff()
	{
		System.out.println("sh... bang");
	}
}
