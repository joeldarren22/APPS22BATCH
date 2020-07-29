
public class ThreadDemo {

	public static void main(String[] args) 
	{
	
		
		System.out.println(Thread.currentThread());
	 //Lets create an Object of The Thread class
		Thread obj=new Thread();
		System.out.println(obj.getName());
		obj.setName("Wipro");
		System.out.println("After Name change:"+obj.getName());
		
		System.out.println("Priority:"+obj.getPriority());
		System.out.println("Priority:"+obj.MIN_PRIORITY);
		System.out.println("Priority:"+obj.MAX_PRIORITY);
		
		
		obj.setPriority(8);
		System.out.println("After change Priority:"+obj.getPriority());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
