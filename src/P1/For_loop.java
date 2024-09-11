package P1;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
		}
	System.out.println();
}*/
		int[] rollnumber= {45,8,2,4,7};
		String[] names= {"abc","xyz","Deepika"};
		
		int[] nullArray= {}; 
		
	for(int i=0;i<=rollnumber.length-1;i++)
	{
		System.out.println(rollnumber[i]);	}
	
	for(int i=0;i<=names.length-1;i++)
	{
		System.out.println(names[i]);	}
	
	for(int data:rollnumber) {
		System.out.println(data);
	}
	
	System.out.println(nullArray.length);
	}

}
