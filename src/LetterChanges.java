import java.util.Scanner;
import java.io.*;

class LetterChanges {  
  String letterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String changedString = "";
    for (int i = 0; i < str.length(); i++) {
      int code = (int) str.charAt(i);
      if (code >= 97 && code <= 122) {
        int changedCode = (int) (code + 1 - (code / 122) * 26);
        if (changedCode == 97 || changedCode == 101 || changedCode == 105 || changedCode == 111 || changedCode == 117) {
          changedCode -= 32;
        }
        changedString += (char) changedCode;
      } else if (code >= 65 && code <= 90) {
        changedString += (char) (code + 1 - (code / 90) * 26);
      }
    }
    return changedString;
     
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    LetterChanges c = new LetterChanges();
    System.out.print(c.letterChanges(s.nextLine())); 
    s.close();
  }   
  
}
