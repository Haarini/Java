import java.util.*;
import java.lang.*;

class concat2
{  
    public static void main(String args[])
    {
  String str1 = "Java";    
	String str2 = "Tutorial"; 
	
	if(str1.length() >= str2.length())
		System.out.println( str2+str1+str2);
	else
	System.out.println(str1+str2+str1);	
}
}
    
