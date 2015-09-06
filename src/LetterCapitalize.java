import java.util.Scanner;
import java.io.*;

class LetterCapitalize {  
  String letterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String capitalizedString = "";
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i); 
      int code = (int) character;
      if ((i == 0 || str.charAt(i - 1) == ' ') && (code >= 97 && code <= 122)) {
        capitalizedString += (char) (code - 32);
      } else {
        capitalizedString += character;
      }
    }
    return capitalizedString;    
  
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    LetterCapitalize c = new LetterCapitalize();
    System.out.print(c.letterCapitalize(s.nextLine())); 
    s.close();
  }   
  
}
