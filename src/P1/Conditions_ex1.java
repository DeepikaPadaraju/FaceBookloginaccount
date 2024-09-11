package P1;

public class Conditions_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int x=10;
      //int y=20;
		/*String name="deepika";
		//if elseif statements
      if(name=="gdhsdg")
      {
    	  System.out.println("Name is gdhsdg ");
      }
      else if(name=="abc"){
    	  System.out.println("Name is abc"); 
      }
      
      else {
    	  System.out.println(name);
      }*/
		
		String address = "Miyapur,Hyderabad,India";    
	    
		if(address.endsWith("India")) {    
		if(address.contains("Meerut")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("Noida")) {    
		System.out.println("Your city is Noida");    
		}else {  
			
		System.out.println(address.split(",")[1]);    
		}    
		}else {    
		System.out.println("You are not living in India");    
		}   
		
		
	}

}
