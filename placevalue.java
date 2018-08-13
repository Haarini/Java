import java.util.*;
import java.lang.*;
//Getting place value of 6 digit number
class placevalue
  
    { 
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      System.out.println(n1 + " Lakhs " + n2 + " Ten thousands " + n3 + " Thousands " + n4 + " Hundreds " + n5 + " Tens " + n6+" Ones ");

    }
}
