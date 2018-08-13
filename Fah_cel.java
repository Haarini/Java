import java.util.*;
import java.lang.*;
//Converting fahrenheit to celsius
import java.util.Scanner;
class Fah_cel
{  
  

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
