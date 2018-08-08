//Java program to check whether an given integer is a power of 4 or not
import java.util.*;

public class power4 
{

   
    public static void main(String[] args)
 {
      
        int test = 0;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Input a positive integer: ");
	   int n = in.nextInt(); 
       if (n < 1) {
			 System.out.print(Boolean.toString(false));
			 test = 1;
		}
		if ((n & (n - 1)) != 0) {
			System.out.print(Boolean.toString(false));
			test = 1;
		}
		if (test==0)
		{
			System.out.print(Boolean.toString((n & 0x55555555) != 0));      	
		}
		System.out.print("\n");
    }
    
}