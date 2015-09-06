import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

class AlphabetSoup {  
  String alphabetSoup(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String[] letters = str.split("");
    Arrays.sort(letters, String.CASE_INSENSITIVE_ORDER);
    StringBuilder sb = new StringBuilder(letters.length);
    for (String letter: letters) {
      sb.append(letter);
    }
    return sb.toString();
  
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    AlphabetSoup c = new AlphabetSoup();
    System.out.print(c.alphabetSoup(s.nextLine())); 
    s.close();
  }   
  
}
