		abstract class Animal     
			{
				void setAnimalName(String s)
				{
				System.out.println("Name of the animal is:"+s);		
				}
				abstract void features();   // u have to write the implementaion of this method in child/sub class
								
				

			}
		class Dog extends Animal
			{
void features()
{
System.out.println("The Dog Barks");
}

			}

		

		class Cat extends Animal
			{
void features()
{
System.out.println("The Cat says Meow");
}



			}

		
		class Absdemo
		{

		public static void main(String a[])
		{

		Animal  aref;
		aref=new Dog();

		aref.setAnimalName("DobberMan");

		aref.features();
	
		aref=new Cat();

		aref.setAnimalName("Persioan");

		aref.features();


		}

		}


















	
		