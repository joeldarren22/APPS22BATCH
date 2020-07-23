		class  Student
		{
		Student()
			{
				this("Amresh",198.45f);	
		System.out.println("Inside Default Constructor");
			}

			Student(int a)
			{
				this();
				
	System.out.println("Inside Overloaded Constructor");
		
			}

			Student(String a,float f)
			{
			System.out.println("Called third constructor:");
			System.out.println("String Values:" +a +" Float Value:   "+f );
			}
	} 			
			
	class call
	{
	public static void main(String a[])
	{
		Student obj=new Student(100);
	}
	}// end








	
				