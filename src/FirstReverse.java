import java.util.Scanner;
import java.io.*;

class FirstReverse {  
  String firstReverse(String str) {

    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String reversedString = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversedString += str.charAt(i);
      }
    return reversedString;    
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here
    Scanner s = new Scanner(System.in);
    FirstReverse c = new FirstReverse();
    System.out.print(c.firstReverse(s.nextLine())); 
    s.close();
  }   
  
}








  