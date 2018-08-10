// problem without method overriding
	class override{  
	  void run(){System.out.println("Vehicle is running");}  

	 public static void main(String args[]){  
	  Bike obj = new Bike();  
	  obj.run();  
	  }  
	}  
	class Bike extends override{  
	    
	  public static void main(String args[]){  
	  Bike obj = new Bike();  
	  obj.run();  
	  }  
	}  