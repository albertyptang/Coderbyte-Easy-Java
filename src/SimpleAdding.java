import java.util.Scanner;
import java.io.*;

class SimpleAdding {  
  int simpleAdding(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    return sum;
     
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    SimpleAdding c = new SimpleAdding();
    System.out.print(c.simpleAdding(s.nextInt())); 
    s.close();
  }   
  
}
