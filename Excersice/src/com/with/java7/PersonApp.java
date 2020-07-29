package com.with.java7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class Person
{
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Person(String firstname, String lastname,int age ) {
		super();
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	int age;
	String firstname;
	String lastname;
	@Override
	public String toString() {
		return "Person [age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	

}
public class PersonApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	List<Person> pl=new ArrayList<Person>();
	
	pl.add(new Person("Raj","Kapoor",70));
	pl.add(new Person("Shahrukh","Khan",55));
	pl.add(new Person("Dilip","Kumar",90));
	pl.add(new Person("Kajol","Devgan",45));
	pl.add(new Person("Juhi","Chawla",52));
	pl.add(new Person("Alia ","Bhat",25));
	
	
	//After using lambda
	System.out.println("After Lamda");
	Collections.sort(pl,(p1,p2)->p1.getLastname().compareTo(p2.getLastname()));
	
	
	
	
	//Collections.sort(reference of lIST, reference of Compartor);
	
	
	
	printAll(pl);
	
	
	
	
	
/*	byLastName(pl);
	System.out.println("Sorting all data by last name");
	
	printAll(pl);
		
	Collections.sort(pl,new Comparator<Person>()
			{
		
		public int compare(Person p1,Person p2)
		{
			
			return p1.getLastname().compareTo(p2.getLastname());
	
		}
	});
*/	
	
	// CALLING METHODS
/*	printAll(pl);
	
// After using lambda
	System.out.println("After Lamda");
	
	Collections.sort(pl,(p1,p2)->p1.getLastname().compareTo(p2.getLastname()));
	
	
	printAll(pl);
	System.out.println("By Last Name");
	byLastName(pl);
	}
*/

	}
	
	public static void printAll(List<Person> p)
{
	
	for(Person x:p)
	{
		
		System.out.println(x);
	}

}

	
	public static void byLastName(List<Person> p)
	{
		
		for(Person x:p)
		{
			if(x.getLastname().startsWith("K"))
			{
			System.out.println(x);
			}
			
			}

	}


}
