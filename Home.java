
// default
	class HomePage
	{

			int i;

		  HomePage()
		{

		i=10;
		
			System.out.println("Inside The Constructor");
		}


			void getValue()
			{
				i=20;
			}

			void print()
			{
				System.out.println("Value of i=:"+i);
			}



		}


	

		class MainClass
	{
	public static void main(String a[])
	{

	HomePage obj1=new HomePage();
	obj1.print();
	}

	}

/* What are Constructors....?
1. Constructors are just lilke methods but they are not really methods.....
2.Constructors are called when an object of the class is created.
3. By Deafault all classes will be having empty contructors ,the compiler will add to the class,if the user has not created a constructor explicity in the class
Reason
	Nameoftheclass()
	{

	}		

Rules of Constructor:

1.Constructor Name should be the same name of the class

	Nameoftheclass()
	{

	}		

2.we cannot assign a return type even the void  should not be used.

	void Nameoftheclass()// invalid
	{

	}		


	int/float/double Nameoftheclass()  //invalid
	{

	}		



3.Constructor are by default assigned "default" key word we can also declare them by public key word for better visibility accross the Appication.

	public Nameoftheclass()
	{

	}		


4. When assigned "private" to Constructor we cannot create the object of the class outside in some other classess.


	private Nameoftheclass()
	{

	}		


		ClassName obj=new Class();// will not be posiible


5. Constructors can also have argument list

	Nameoftheclass(arg1,arg2,arg3......)
	{

	}		

*/ 

//In Realtime
//Constrcutor are good when we want some early initialization to be done,because methods are late initiaization


