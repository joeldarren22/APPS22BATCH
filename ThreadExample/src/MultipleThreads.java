
public class MultipleThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Job job=new Job();
		
		Thread ibm=new Thread(job);
		ibm.setName("Ibm Thread");
		ibm.start();
		
		Thread morgan=new Thread(job);
		morgan.setName("jp Morgan");
		morgan.start();
		
		
		Thread sap=new Thread(job);
		sap.setName("Sap Labs");
		sap.start();
		
		
		
	}

}
