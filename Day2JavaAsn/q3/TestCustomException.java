package Asn3;

public class TestCustomException {
	  static void validate (int sal) throws InvalidSalException{    
	       if(sal < 100000){  
	  
	        // throw an object of user defined exception  
	        throw new InvalidSalException("yearly salary is less than 100000");    
	    }  
	       else {   
	        System.out.println("yearly salary is more than 100000");   
	        }   
	     }    
	  
	    // main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            // calling the method   
	            validate(4300);  
	        }  
	        catch (InvalidSalException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
	      
	}  

}
