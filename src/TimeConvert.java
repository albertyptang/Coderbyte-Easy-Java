import java.util.Scanner;
import java.io.*;

class TimeConvert {  
  String timeConvert(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int hours = num / 60;
    int minutes = num % 60;
    return hours + ":" + minutes;
  
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    TimeConvert c = new TimeConvert();
    System.out.print(c.timeConvert(s.nextInt())); 
    s.close();
  }   
  
}
