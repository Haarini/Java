import java.util.*;
import java.lang.*;
//converting a string to lowercase
class lowcase
{  
    public static void main(String args[])
    {
              
       Scanner in = new Scanner(System.in);
     System.out.print("Input a String: ");
	 String line = in.nextLine();
	 line = line.toLowerCase();
	 System.out.println(line); 
	 }			
}
