// This Programme demonstrates the usage of static block and no-name
//
class BlockDemo
{

/*1. static block is the first to be loaded and exectued before any other blocks,ie even before the main method block.

2. 
*/



public static void main(String a[])
{
System.out.println("Inside The Main Block");

	// Always the creatinon of objects calling of methods is done in main method

BlockDemo obj=new BlockDemo();
BlockDemo obj1=new BlockDemo();
BlockDemo obj2=new BlockDemo();
BlockDemo obj3=new BlockDemo();

}



static
{
System.out.println("Inside The Static  Block");

}

	{

	System.out.println("Inside The No-Name Block");
	}

}


// About the no-name block

//1.This block gets executed when an object of a class is created 

//2. This block gets called multiple times when multiple objects are created.

// No.of objects=no. of times the block gets executed
// 3 objects-=3times


// where as static block will loaded an executed only once in the lifetime of that class



// use case of static in Java Project Development

//1. Loading some default properties   

// Grocery Application:  its should set tdatabase properties,it should network coonection or user //authentication should be enable for use,or some dependent project files should be loaded without the //programming  make an instrucyion



//***********************How to Create Object in Java

//  Syntax
//   ClassName refvariable=new  ConstructorofClass();
