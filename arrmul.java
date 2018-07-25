import java.util.*;
import java.lang.*;
//Multiplying corresponding elements of array
class arrmul
{  
    public static void main(String args[])
  {
String result = "";
	   int[] left_array = {3, 34, -56, 48};
	   int[] right_array = {19, 43, -523, -26};
	   System.out.println("\nArray1: "+Arrays.toString(left_array));  
	   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
       for (int i = 0; i < left_array.length; i++) {
				int num1 = left_array[i];
				int num2 = right_array[i];
				result += Integer.toString(num1 * num2) + " "; 
			}
		System.out.println("\nResult: "+result);     
	 }			
 }


