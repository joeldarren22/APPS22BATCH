package com.using.streammethod;

import java.util.ArrayList;
import java.util.List;





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

public class UingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<Person> pl=new ArrayList<Person>();
	
		pl.add(new Person("Raj","Kapoor",70));
		pl.add(new Person("Shahrukh","Khan",55));
		pl.add(new Person("Dilip","Kumar",90));
		pl.add(new Person("Kajol","Devgan",45));
		pl.add(new Person("Juhi","Chawla",52));
		pl.add(new Person("Alia ","Bhat",25));
		
		pl.stream().forEach(p-> System.out.print(p));
		
		System.out.println("-----------------------------");
		
		// Here goes parllel procession or pipe lining the task
		
		
		pl.stream()
		.filter(p ->p.getLastname().startsWith("K"))
		.forEach(p-> System.out.print(p.getFirstname()));
		
		

	
	}

}
