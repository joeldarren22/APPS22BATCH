// Rules for Creating User Define Exception
//1. Ur Exception Class should extend Exception class

//2.Dont try to extends with Runtime(its jre related)
// Why we require Userdfined Exeptions
//They are useful for the particular Oraganization and Team to remeber and
// handle their own excpetions.

class NoInteractionException extends Exception
{
	NoInteractionException()
	{
		
		System.out.println("Exception occured due to No interaction");
	}
	
	
	
}

class Trainer
{
	
	
	void askQuestions(String quest,String ans)throws NoInteractionException
	{
		if(quest!=null && ans==null) 
		{
			throw new NoInteractionException();
		}
		else 	if(quest!=null && ans!=null) 
			{
				System.out.println("Particpants are active ");
			}
			
	}
	
	
}


public class UserDefinedExceptionDemo {

	public static void main(String[] args) throws NoInteractionException {
		// TODO Auto-generated method stub

	
	Trainer t=new Trainer();
	t.askQuestions("Hi Everyone","ok");
	
	}

}
