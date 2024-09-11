package P1;

public class C1 {

	public static int a=23;
	
      public static void display()
	
	{
		System.out.println("First package with class c1");	
		}
      
      public class C5 extends C1{
    	  
   protected static void show()
   {
	  display();
   }
   
      }  
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // C5.display();
		C5.show();
         System.out.println(a);	
         //C2 c2 = new C2();
        // System.out.println(c2.b);
             
	}

}

