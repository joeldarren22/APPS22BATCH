
public class ReadThread extends Thread 
{

public void run()
{
	for(int i=0;i<5;i++)
	{
	
		System.out.println("Reading Process is going on...." +i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}




}


}



