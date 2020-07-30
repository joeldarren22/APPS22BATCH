
/*
 * Executor’s newSingleThreadExecutor factory method :
This method returns thread pool executor which executes one task at a time.

If you have submitted n task to executors, 
it will execute it one by one.If this thread gets interrupted
 then a new thread will be created for executing the tasks.
 * 
 */

package com.demo.singlethreadexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class SingleThreadExcecitorDemo {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
ExecutorService es=Executors.newSingleThreadExecutor();
		
		for (int i = 1; i <= 3; i++) {
			LoopTask loopTask=new LoopTask("LoopTask "+i);
			es.submit(loopTask);
		}
		es.shutdown();
	}

}


/*Difference between newSingleThreadExecutor and newFixedThreadPool(1)
You can not change thread pool size of executors returned by newSingleThreadExecutor but you can change thread pool size of executors returned by newFixedThreadPool(1) by calling 
setCorePoolSize() of the class ThreadPoolExecutor.
*/
