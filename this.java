// this keyword to return as a statement from the method
import java.util*;
class this{
	public void getA(){  
		return this;  
		}  
		void msg(){System.out.println("Hello java");}  
		}  
		
		class Test1
{  
		public static void main(String[] args)
{  
		new this().getA().msg();  
		}  

}