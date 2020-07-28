
@FunctionalInterface
interface LoginPage
{
	void login();
		default void message()
		{
			
			System.out.println("Welcome all to Labmda Programming");
		}
		default void message1()
		{
			
			System.out.println("Welcome all to Labmda Programming");
		}
		void logout();

}

interface Calculator
{
	
	int add(int a,int b);
}

interface Status
{
	
	int showStats(int a);
}




public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
/*BannerImpl bimpl=new BannerImpl();
*/
		/*Banner b=()->	{
		System.out.println("hello");
		};
		*/

		Banner b=()->	{
		
		System.out.println("hello1");
		};
		b.showMessage();
		

		Banner b1=()-> System.out.println("hello2");
		b1.showMessage();
		CreateBanner cb=new CreateBanner();
		cb.createBanner(()-> System.out.println("hello3"));
		
		
		LoginPage lp=()->System.out.println("Login Page Code");
		lp.login();
	
		
		
		
		Calculator cobj=(int x,int y)->
	{
		
		return x+y;
	};
	
	System.out.println(cobj.add(10, 20));
	
	// Type Inference
	Calculator cobj1=(x,y) ->
	{
		
		return x+y;
	};
	// do we have to mention return key word in lambda 
	// Ans no
	
	Calculator cobj2=(x,y) -> x+y;
	
	
	
	
	
	System.out.println(cobj1.add(50, 50));
// This is applicable only if the method has one argument
	Status st=a->
	{
	return a;
	};
	
	System.out.println(st.showStats(10));
	}




}
