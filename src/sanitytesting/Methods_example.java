package sanitytesting;

public class Methods_example {
	
	public static int addition(int a,int b)
	{
		//static with return data type & arguments
		
		int c= a+b;
		return c;
	}
	
	public void show()
	{
		//Non static and no return type
		
		System.out.println("Non static and no return type");
		
	}

	
	public class Method_override extends Methods_example{
		public void show() {
			System.out.println("Method override of Methos_example class");	
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int AdditionResult=addition(45,45);
		int AdditionResult2=addition(78,45);
		
		
		System.out.println("Return value is " +AdditionResult);
		System.out.println("Return value is " +AdditionResult2);
		
		//Methods_example obj1=new Method_override();
		
		//obj1.show();

	}
	}




