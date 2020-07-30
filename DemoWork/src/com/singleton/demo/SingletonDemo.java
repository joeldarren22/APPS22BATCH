package com.singleton.demo;

public class SingletonDemo {


	   public static void main(String[] args) 
	   {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	     //SingleTonObject object = new SingleTonObject();

	      //Get the only object available
	      SingleTonObject object = SingleTonObject.getInstance();
	      //show the message
	      object.showMessage();
	      

	   }
}
