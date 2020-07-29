
public class WriteThread extends Thread 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=0;i<5;i++)
		{
		
			System.out.println("Writing Process is going on:"+i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
	
	
	}
}
