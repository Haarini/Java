import java.util*;
//inheritance
public class employee
{

			 float salary=40000; 
			 public static void main(String[] args)
			 {  
			   Programmer p=new Programmer();  
			   System.out.println("Programmer salary is:"+p.salary);  
			   System.out.println("Bonus of Programmer is:"+p.bonus);  
			}  
			}  
			class Programmer extends employee
			{  
			 int bonus=10000;
			}
			
			 
}