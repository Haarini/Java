import java.util.*;
import java.lang.*;
//To rotate first and last element in an array
class rotfl
{  
    public static void main(String args[])
  {
    int[] array_nums = {23, 345, 450};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int x = array_nums[0];
	array_nums[0] = array_nums[array_nums.length-1];
	array_nums[array_nums.length-1] = x;
	System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));  
 } 	 
 }
