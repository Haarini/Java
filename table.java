import java.util.*;
import java.lang.*;
import java.util.Scanner;
class table
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,p;
        System.out.println("Enter First Number: ");
        m= sc.nextInt();
        for (int i=0; i< 10; i++)
        {
        System.out.println(m + " x " + (i+1) + " = " + 
        (m * (i+1)));
        }
    }
}    
