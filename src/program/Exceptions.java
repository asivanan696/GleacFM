package program;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			System.out.println("Hello how are you");  
			
			int data=25/0;  
			    
			  }  
			  catch(NullPointerException e)
		
		
		{
				  System.out.println(e);
				  System.out.println("Hello");
				  
		}  
		
		
			  finally{System.out.println("finally block is always executed");}  
			  System.out.println("rest of the code...");  
			  }  
			}  
