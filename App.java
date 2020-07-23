	class Employee
	{
		public void work()
		{
		System.out.println("Employee Work");
		}

	}


	class Manager extends Employee
	{
		
		public void work()
		{
		System.out.println(" I Manage the employee of the company");
		}
	}

	class Sales extends Employee
	{
			public void work()
			{
		System.out.println("Im from Sales Dept");
		}


	}


	class App
	{

	public static void main(String a[])
	{
	Employee e;// create arefernce of base class
		
		e=new Manager();  // means e is pointig to the location of Manager
		e.work();
		e=new Sales();
		e.work();



	}
	
	}

// Over-riding
// Rules are
// When u want to over-ride a method os parent class into child classs
//then the mehthod name,signature,synatx should be same
