import java.util.*;
import java.lang.*;
import java.util.Scanner;

//Printing characterset
class charset
{  
 public static void main(String args[])
 {
 System.out.println("List of available character sets: ");  
    for (String str : Charset.availableCharsets().keySet()) 
    {
      System.out.println(str);
    }
  }
	}


  
  
