
public class ExcepDemo {

	public static void main(String[] args) {
		
		int x=0;
		try
		{
		x=10/0;
		}catch(Exception e )
		{
			//System.out.println("Handled Exception"+e.getMessage());
			e.printStackTrace();
		}
			System.out.println("Value of x is:"+x);
			
			
			System.out.println("hai");
			System.out.println("hello");
			System.out.println("Bye");



	}

}
