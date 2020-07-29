
public class ExecutThreads {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	ReadThread r=new ReadThread();  //reation
	r.start();// geting to runnable and it will call automitacly it will run
	
	WriteThread wr=new WriteThread();  //reation
	wr.start();// geting to runnable and it will call automitacly it will run
	
	try
	{
		Thread.sleep(1000);
	r.join();// not allwed to over Thread
	}catch(InterruptedException ie)
	{
		
	}
	
	
	// read thread to complete its 5 times iteration and
	//the give the actvity to writer thread
	
	/*try
	{
		Thread.sleep(1000);
	wr.join();
	}catch(InterruptedException ie)
	{
		
		
	}
	*/
	
	
	
	
	
	
	
	
	
	}

}
