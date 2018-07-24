import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.File;

//printing filesize

class file
{  
 public static void main(String args[])
 {
  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
 }
}
  
  
