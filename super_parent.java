//super can be used to invoke parent class method
	class super_parent
{  
	void message(){System.out.println("welcome");}  
	}  
	  
	class Student16 extends Exp33
{  
	void message(){System.out.println("welcome to java");}  
	  

	void display()
{  
	message();//will invoke current class message() method  
	super.message();//will invoke parent class message() method  
	}  
	  
	public static void main(String args[])
{  
	Student16 s=new Student16();  
	s.display();  
	}  
	}  
