
public class MainApp {

	public static void main(String[] args) 
	
	{
			//InternetServices ir=new InternetServices(); comiple error
	
		InternetServices services;
		services=new Tv();
		
		services.playMovies();
		System.out.println(InternetServices.movieoption);
		services=new Mobile();
		services.playMovies();
		
			BusTicketService br=new VRLTravels();
			br.bookTicket();
		
			br=new OrangeBus();
			br.bookTicket();
	}

}
