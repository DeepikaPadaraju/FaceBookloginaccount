package sanitytesting;

public class Bank {
	private int a;
	public int getter_a()
	{
		return a;
	}
public void setters_a(int a)
{
	this.a=a;
}
	public static void main(String[] args) {
// TODO Auto-generated method stub
		//System.out.println("the value of b is" + display(6));
		Bank b1=new Bank();
		b1.setters_a(78);
		System.out.println(+b1.getter_a());
		
		
}
}