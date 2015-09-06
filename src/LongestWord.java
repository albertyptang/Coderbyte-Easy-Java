import java.util.Scanner;
import java.io.*;

class LongestWord {  
  String longestWord(String sen) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String[] words = sen.split(" ");
    int length = 0;
    String longestWord = "";
    for (String word : words) {
      if (word.length() > length) {
        longestWord = word;
        length = word.length();
      }    
    }
    return longestWord;    
  
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    LongestWord c = new LongestWord();
    System.out.print(c.longestWord(s.nextLine())); 
    s.close();
  }   
  
}
