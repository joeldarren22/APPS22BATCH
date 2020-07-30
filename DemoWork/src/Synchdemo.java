
public class Synchdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accountObject = new Account(100);
		new Thread(new DepositThread(accountObject,30)).start();
		new Thread(new DepositThread(accountObject,20)).start();
		new Thread(new DepositThread(accountObject,10)).start();
		new Thread(new WithDrawThread(accountObject,30)).start();
		new Thread(new WithDrawThread(accountObject,50)).start();
		new Thread(new WithDrawThread(accountObject,20)).start();
		
	}

}
