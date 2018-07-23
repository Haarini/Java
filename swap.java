import java.util.*;
import java.lang.*;
import java.util.Scanner;
class swap
{  
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to swap ");
        a = sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
    a = a + b;
   b = a - b;
   a = a - b;
   System.out.println("After swapping : a, b = "+a+", "+ + b);
        
}
}
