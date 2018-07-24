import java.util.*;
import java.lang.*;
// to check first element of an array
class arraycheck
{  
    public static void main(String args[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number: ");
        x = sc.nextInt();
        
    int[] num_array = {10, -20, 0, 30, 40, 60, 10};
    System.out.println((num_array[0] == x || num_array[num_array.length-1] == x));	
 
}

      
    }
