import java.io.IOException;

// Creator will anticipate the future exception in time and warn the user

class Creator

{
	void add(int a,int b)throws IOException
	{
		int c=a+b;
		System.out.println(" Valus is:"+c);
	}
	
	
}


class User
{
	
	void calc()throws IOException
	{
		Creator cr=new Creator();
			cr.add(100, 22);
			
	}
	
	
	
}




public class ThrowsDemo {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		 User u=new  User();
		 u.calc();
		 u.wait();
		 
		 
		 
	}

	
}
