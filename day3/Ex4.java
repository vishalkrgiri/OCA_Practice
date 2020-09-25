package day3;

class Test {    
    Test(int x) { 
        System.out.println("Constructor called " + x); 
    } 
} 

public class Ex4 {
	Test t1 = new Test(10);
	 Ex4(int i)
	 { 
		 t1 = new Test(i);
	 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 t2 = new Ex4(5);
	}

}
