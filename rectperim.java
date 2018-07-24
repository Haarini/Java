import java.util.*;
import java.lang.*;

class rectperim
{  
    public static void main(String args[])
    {
        double width,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and width: ");
        width = sc.nextInt();
        height = sc.nextInt();
        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", height, width, area);
    }
}
    
