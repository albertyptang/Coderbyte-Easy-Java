import java.util.Scanner;
import java.io.*;

class FirstFactorial {  
  int firstFactorial(int num) { 
  
    // code goes here   
	int factorial = 1;
	while(num > 0){
		factorial *= num;
		num--;
	}
    return factorial;    
  } 
  /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    FirstFactorial c = new FirstFactorial();
    System.out.print(c.firstFactorial(s.nextInt())); 
    s.close();
  }   
  
}








  