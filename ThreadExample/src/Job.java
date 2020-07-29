
public class Job implements Runnable 
{
	String str[]={"Amresh","Shravya","Shruthi","lakshmi"};
	@Override
public void run() {
	// TODO Auto-generated method stub
	

for(String s:str)
{
	
	System.out.println(Thread.currentThread().getName() + "--->"+s);
	try {
	
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

		

}
	
	
}
