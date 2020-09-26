package day4;

public class Ex5 extends Thread 
{ 
    public void run() 
    { 
        System.out.print("Hello..."); 
    } 
    public static void main(String args[]) 
    { 
        Ex5 T1 = new Ex5(); 
        T1.start(); 
        T1.stop(); 
        T1.start();  //Runtime exception as thread can't be started twice
    } 
} 