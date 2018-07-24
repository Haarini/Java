import java.util.*;
import java.lang.*;
import java.util.Scanner;
//comparison between two numbers
class compare
{  
 public static void main(String args[])
 {
    Scanner input = new Scanner(System.in);
        int number1;        
        int number2;  
      
        System.out.print( "Input first integer: " ); //       
        number1 = input.nextInt(); // read first number from user   
 
        System.out.print( "Input second integer: " );       
        number2 = input.nextInt(); // read second number from user               
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
    }
  }
  
