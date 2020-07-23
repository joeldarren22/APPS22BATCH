// Need to Create An Employee Information


		class Employee
			{
			String ename;
			static int empid;
			String desg;
			float salary;
						
			void addData(String ename,String desg,float salary )    
			{
			this.ename=ename;
			this.desg=desg;
			this.salary=salary;
			empid++;
			}
				
			void display()
			{
			
					System.out.println("Name:"+ename);	
					System.out.println("Name:"+empid);
					System.out.println("Name:"+desg);
					System.out.println("Name:"+salary);
					System.out.println("************************************");


			}

			static void printDetails()
			{
				System.out.println("This is a static method");
			}

		}


			

			class MainApp
			{


			public static void main(String a[])
				{

						Employee emp=new Employee();
						emp.addData("Amresh","SE",1234.55f);
						emp.display();


						Employee emp1=new Employee();
						emp1.addData("Shravya","SE",1777.55f);
						emp1.display();

						Employee emp2=new Employee();
						emp2.addData("Joel","SE",1777.55f);
						emp2.display();

									
			}


			}


// Constructors


