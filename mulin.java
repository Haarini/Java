class mulin
//multiple inheritance in java
{
void msg()
{
System.out.println("Hello");
}  
	  
	class B
{  
	void msg(){System.out.println("Welcome");}  
	}  
	class C extends mulin,B{//suppose if it were  
	   
	 public Static void main(String args[]){  
	   C obj=new C();  
	   obj.msg();//Now which msg() method would be invoked?  
	}  
	}  
