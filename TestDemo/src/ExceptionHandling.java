
public class ExceptionHandling {
		  public static void main(String args[]){  
		   try{  
		   int data=100/0;  
		   
		  try {
  Object obj =null;
  obj.toString();
			   //String p = "ajay";
			//System.out.println(p);   
		   }
		  catch(NullPointerException e){System.out.println(e);}
		  }
		 catch(ArithmeticException e){System.out.println(e); }  
		    
		   System.out.println("rest of the code...");  
		  }  
		}  