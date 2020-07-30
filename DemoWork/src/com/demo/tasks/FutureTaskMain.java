package com.demo.tasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import com.demo.tasks.MultiplyingTask;
public class FutureTaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	MultiplyingTask multiplyingTask1= new MultiplyingTask(10,20,2000l);
		
		MultiplyingTask multiplyingTask2= new MultiplyingTask(20,40,4000l);
 
		FutureTask<Integer> futureTask1=new FutureTask<>(multiplyingTask1);
		FutureTask<Integer> futureTask2=new FutureTask<>(multiplyingTask2);
 
		FutureTask<Integer> futureTask3=new FutureTask<>(multiplyingTask1);
		FutureTask<Integer> futureTask4=new FutureTask<>(multiplyingTask2);
 
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);
		
		/*executor.execute(futureTask3);
		executor.execute(futureTask4);
		*/
		while(true)
		{
			try {
				if(!futureTask1.isDone())
				{
					System.out.println("FutureTask1 output="+futureTask1.get());
				}
				if(!futureTask2.isDone())
				{
					System.out.println("Waitng for futureTask2 for completion");
					System.out.println("FutureTask2 output="+futureTask2.get());
				}
				if(futureTask1.isDone() && futureTask2.isDone())
				{
					System.out.println("Completed both the FutureTasks, shutting down the executors");
					executor.shutdown();
					return;
				}
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
 
		
		
		
	}// end of main

}
