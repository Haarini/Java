import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.io.Console;
//printing password
class password
{  
 public static void main(String args[])
 {
Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
	}
}
