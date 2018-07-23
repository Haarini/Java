import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Rextester
{  
    public static void main(String args[])
    {
    int r;
         Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Radius: "+r);
        
  

   

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
 
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
