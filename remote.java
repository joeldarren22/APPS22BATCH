/*
1. Abstraction and Encapsulation w.r.t accessbilty view.    (by using accesspcesfiers)
2. Abstraction and Encapsulation w.r.t Hierarchel Design view.    (by using accesspcesfiers)
*/
//1. Abstraction and Encapsulation w.r.t accessbilty view.    (by using accesspcesfiers)

// Now lets create some  has-a
// Now the Remote Should be used for a Device to Switch on and off

// What is the relationship between tv and remote


//   TV<------------ HAS-A----------------Remote
	
	class Tv
	{

		public void switchOnTv()
		{
		System.out.println("Tv is on");
		}

	}




	class RemoteControl
	{
	// These are the settings of Manufacturer
	private int channel=30;
	private int volume=10;
		
	private void on()
	{// here we write the logic how to make it switchon.....
	System.out.println("Switching on the tv.......");
	}
	private void off()
	{// here we write the logic how to make it switchofff.....
	
			//immlementation area
		System.out.println("Switching off the tv.......");
	}
		
	void changeVolume()
		{
		System.out.println("Volume	Frequency Selected By you is:"+volume);
		}
		
	void switchChannel()
		{
		System.out.println("Select Channel is:"+channel);
		}
	
		public void switchOn()
		{
			on(); //this method is invoked
		}	
		public void switchOff()
		{
			off();
		}

		}	

		class SonyRemote extends RemoteControl
		{
			Tv  ref;	
			
			void playMusic()
			{
			System.out.println("Sony Remote is Playing Music");
			}
			void switchTv(Tv ref)
			{
				this.ref=ref;						
				ref.switchOnTv();
			}
			
		}


		class PhilipsRemote extends RemoteControl
		{
			void speak()
			{
			System.out.println("Philips will give the channel name in speechmode");
			}

		}

		class User
		{
		public static void main(String a[])
		{
	/*		 RemoteControl sony=new RemoteControl();
					sony.switchOn();
					sony.switchOff();
	*/

		
		// Lets assume user has purchased Sony Remote or Philips Remote	
				Tv tref=new Tv();							

					SonyRemote sony=new SonyRemote();
					sony.switchOn();
					sony.switchOff();
					sony.playMusic();
					sony.switchTv(tref);

								
					
		PhilipsRemote ph=new PhilipsRemote();
					ph.switchOn();
					ph.switchOff();
					ph.speak();	

		}
	}













		
