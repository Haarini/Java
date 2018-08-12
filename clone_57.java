//Object cloning
	class clone_57 implements Cloneable{  
	int rollno;  
	String name;  
	  
	clone_57(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
	clone_57 s1=new clone_57(101,"amit");  
	  
clone_57 s2=(clone_57)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
	}  