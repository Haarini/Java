import java.util.*;
//create an array (length # 0) of string values.
public class arrcl
{

    
    public static void main(String[] args) 
{
        
        int n= 5;
	String[] arr_string = new String[n];
	
    for(int i = 0; i < n; i++)
        arr_string[i] = String.valueOf(i);                                  
	 System.out.println("New Array: "+Arrays.toString(arr_string)); 
    }
    
}