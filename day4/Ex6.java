package day4;

public class Ex6 
{ 
    String name; 
  
    Ex6(String n) {  name = n;  } 
  
    public static void main(String[] args) 
    { 
        Ex6 m1 = new Ex6("guitar"); 
        Ex6 m2 = new Ex6("tv"); 
        System.out.println(m2.equals(m1)); 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        Ex6 m = (Ex6) obj; 
        if (m.name != null)  { return true;  } 
        return false; 
    } 
} 
