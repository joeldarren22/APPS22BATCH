
public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		try
		{
		x=10/0;
		}catch(ArithmeticException e)
		{
			// when we we want to create explicitly create an excption object
			// or when we want to overide the defualt exception message
			throw new ArithmeticException("ur trying to divide a number by 0");
			
			
		}
			System.out.println("Value of x is:"+x);
	
	}

}
