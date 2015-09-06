import java.util.Scanner;
import java.io.*;

class CheckNums {  
  String checkNums(int num1, int num2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    if (num2 > num1) {
      return "true";
    } else {
      return "-1";
    }
  
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    CheckNums c = new CheckNums();
    System.out.print(c.checkNums(s.nextInt(), s.nextInt())); 
    s.close();
  }   
  
}
