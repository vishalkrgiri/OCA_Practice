package day4;

class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
  
public class Ex7 extends Alpha 
{ 
    public Ex7()  {  System.out.print("beta ");  } 
  
    void go() 
    { 
        type = "b "; 
        System.out.print(this.type + super.type); 
    } 
  
    public static void main(String[] args) 
    { 
        new Ex7().go(); 
    } 
} 