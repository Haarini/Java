import java.util.*;
import java.lang.*;
import java.util.Scanner;




class num
{  
 public static void main(String args[])
 {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
     
		System.out.println(result(x,y,z));
	 } 		
	public static int result(int x, int y, int z) 
    {	
		if (x%z == 0)
			return( y/z - x/z + 1);
		return(y/z - x/z);
}
}
