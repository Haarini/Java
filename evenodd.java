import java.util.*;
import java.lang.*;
import java.util.Scanner;

//Toc check for even-odd
class evenodd
{  
 public static void main(String args[])
 {
     Scanner in = new Scanner(System.in);
	 System.out.print("Input a number: ");
     int n = in.nextInt(); 
            if (n % 2 == 0) 
            {
                System.out.println("Even number"); 
            }
			else 
            {
                System.out.println("Odd number"); 
            }
}
}
