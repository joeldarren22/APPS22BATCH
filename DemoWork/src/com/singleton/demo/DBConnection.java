package com.singleton.demo;

public class DBConnection

{

private DBConnection()
{
	// here write the code it has to perform
	System.out.println("This is a private to this class");
}

public static DBConnection getObject()
{
	
	DBConnection db=null;
	
	if(db!=null)
	{
		return db;	
	}
	else if(db==null)
	{
		db=new DBConnection();
		
	}
		
	
	return db;
	
	
}

}
