package sanitytesting;

public class TC1_testing {
	
	int id=1234;
	String name="Anand";
	float salary=20000.7f;
	static int departmentnumber=56768;
	
	public int incrementId() {
		
		id = id +1;
		return id;
	}
	
	//public int getId() {
		//return id;
	//}
	

	public static void main(String[] args) {

				// TODO Auto-generated method stub
		
		//int id=4656;
		String name="Deepika";
	
		
		//new object created for class
		
		TC1_testing obj1=new TC1_testing();
		//TC1_testing obj2=new TC1_testing();
		
		System.out.println("id = " +obj1.incrementId());
		//System.out.println("id = " +obj2.incrementId());
		System.out.println("person salary is = " +obj1.salary);
		System.out.println("Name = "+ name);
		System.out.println("DepartmentNumber = "+ departmentnumber);
		
		
		
		
		//System.out.println("Id = " +obj2.getId());
		
		
		

	}

	
	
}
