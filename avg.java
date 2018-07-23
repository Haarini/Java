import java.util.*;
import java.lang.*;
import java.util.Scanner;
class avg
{  
    public static void main(String args[])
    {
    int n1,n2,n3,a;
         
        System.out.println("Enter three numbers to find average");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3=sc.nextInt();
        a=(n1+n2+n3)/3;
        System.out.println("Average of given numbers is= " + a);
       
    }
}
