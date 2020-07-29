package com.foreach.example;

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
public class ForEachDemo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	List<Person> pl=new ArrayList<Person>();
	
	pl.add(new Person("Raj","Kapoor",70));
	pl.add(new Person("Shahrukh","Khan",55));
	pl.add(new Person("Dilip","Kumar",90));
	pl.add(new Person("Kajol","Devgan",45));
	pl.add(new Person("Juhi","Chawla",52));
	pl.add(new Person("Alia ","Bhat",25));
	
// Iterate over the collection using all varities
	/*for(int i=0;i<pl.size();i++)
	{
		System.out.println(pl.get(i));
	}
	*/
	/*String str[]={"Java","Unix","Oracle"};
	
	
	for(String x:str)
	{
		System.out.println(x);
		
	}*/
	// Enhanced For-loop
	/*for(Person p:pl)
	{
		System.out.println(p.getFirstname()   +"  " +p.getAge());
	}
	*/
	
	
	System.out.println("Print with Lambda");
	// method
	pl.forEach(p-> System.out.print(p.getFirstname()));
	
	
	/*// with foreach stream of java8
	// forEach()----> Method available under Iterable interface
	 // Iterable interface is a part of java.lang package
	  // All collections implement this Interface
	   * 
	pl.forEach(p-> System.out.print(p));
	
	// Method reference
	pl.forEach(System.out::println);
	*/
	}
}
