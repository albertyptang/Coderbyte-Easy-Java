import java.util.Scanner;
import java.io.*;

class SimpleSymbols {  
  boolean simpleSymbols(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    for (int i = 0; i < str.length(); i++) {
      int code = (int) str.charAt(i);
      if ((code >= 97 && code <= 122) || (code >= 65 && code <= 90)) {
        if (i == 0 || i == str.length()-1 || str.charAt(i-1) != '+' || str.charAt(i+1) != '+') {
          return false;
        }
      }
    }
    return true;    
  
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    SimpleSymbols c = new SimpleSymbols();
    System.out.print(c.simpleSymbols(s.nextLine())); 
    s.close();
  }   
  
}
