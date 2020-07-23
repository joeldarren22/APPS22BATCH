	

class WrapDemo

{

public static void main(String a[])
{

		int ival=10;

// convert a primitive type to Wrapper Type  is called Boxing

			
	Integer iob=ival;  
System.out.println(iob);
	//OR

	Integer iob1= new Integer(ival);  
System.out.println(iob1);

Integer  valobj=new Integer(2000);
// convert a Wrapper  to primitive type s called  UnBoxing

int val2=valobj;
System.out.println(val2);

// Note befor e1.5

//Integer iob1= new Integer(ival);  
//int x=iob1.intValue();




}





}

