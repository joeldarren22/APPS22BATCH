

//1. Need a class with one  methods which can calulate the sum of any 2 numbers.
// Without Generics
/*class  Calculate
{
	
	
	void sum(double d,double d1)
	{
	double	result=d+d1;
	System.out.println(result);
		
	}

	void sum(int d,int d1)
	{
	int	result=d+d1;
	System.out.println(result);
		
	}

	
	void sum(float d,float d1)
	{
	float	result=d+d1;
	System.out.println(result);
		
	}
	
}

*/
// A scenario where i need only one method to display any type of Data

// Bounded Generic Types

class  Calculate<T extends Number>
{
	void display(T ref)
	{
		
		System.out.println(ref.getClass().getName());
			System.out.println(ref);
	}
	
	
		
}


public class GenDemo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculate<Float> obj=new Calculate<Float>();
		
		obj.display(10.5f);
		
		obj.display(10);
		
		/*obj.display("Java");
		
		obj.display(100);
		
		obj.display('c');
		
		obj.display(10.5f);
		*/
				
		//we want the vm to avoid this by saying it should have only required dataype specfied
		
		
	}

}
