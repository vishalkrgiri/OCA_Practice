package day2;


class Student{
	String name;
	public Student(String name)
	{
		this.name=name;
	}
}
public class Ex4 {

	public static void main(String[] args)
	{
			Student[] students = new Student[3];
			
			students[1]=new Student("Richard");
			students[2]=new Student("Donald");
			for(Student n: students)
			{
				System.out.println(n.name);
			}
	}

}
