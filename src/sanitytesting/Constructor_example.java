package sanitytesting;
import P1.C2;

public class Constructor_example extends C2{

	Constructor_example()
	{
		
	}
	
	public void login()
	{
	int a=46;
	System.out.println(a);
	}
	
	public void display()
	{
	System.out.println("Method overridding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_example obj=new Constructor_example();
	obj.login();
	C2 obj1=new Constructor_example();
	obj1.display();
	}

}
