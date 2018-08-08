import java.util.Arrays;
import java.util.io*;
public class 90 {

    
    public static void main(String[] args) {
        
        System.out.println("\nEnvironment variable PATH: ");
      System.out.println(System.getenv("PATH"));

      // gets the value of the specified environment variable "TEMP"
      System.out.println("\nEnvironment variable TEMP: ");
      System.out.println(System.getenv("TEMP"));

      // gets the value of the specified environment variable "USERNAME"
      System.out.println("\nEnvironment variable USERNAME: ");
      System.out.println(System.getenv("USERNAME"));
    }
    
}