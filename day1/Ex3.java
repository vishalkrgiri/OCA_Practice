package day1;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5);  //12ABC45
        s.append(s.delete(3, 6)); //12A512A5
        System.out.println(s); 
	}

}
