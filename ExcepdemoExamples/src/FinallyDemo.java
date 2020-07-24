
public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		try
		{
		x=10/0;
		
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Handled Arithmetic Exception");
			}
			finally
			{
			System.out.println("Inside Finaaly");
			
			}
	
	
	}

}
