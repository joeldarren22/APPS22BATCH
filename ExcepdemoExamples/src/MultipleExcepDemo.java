
public class MultipleExcepDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		int x=0;
		int arr[]={1,2,4};
		
		try
		{
		x=10/0;
		System.out.println(arr[5]);
		
		}catch(ArithmeticException e)
		{
			System.out.println("Handled Arithmetic Exception");
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			
			System.out.println("Handled Aray Problem:");
			
		}		
		
		System.out.println("End of the Programme");
		
	// In Java 7
		
		
		try
		{
		x=10/0;
		System.out.println(arr[5]);
		
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Handled Exception using java7 features");
			
		}
	
	
	}

}
