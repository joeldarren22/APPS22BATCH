interface TransportServices
{
void book();
}

interface AutoServices extends TransportServices
{
	
	void bookAuto();
	
}
interface BusService  extends TransportServices
{
void bookBusTicket();
}


interface CarService extends TransportServices
{
void bookCab();

}

interface FlightServices  extends TransportServices
{
void bookFlight();

}

// Now we have to tell the BusOperator in the market to use this Service and writer ur own Implementation
class OrangeTours implements BusService
{
public void bookBusTicket()
{
System.out.println("Welcome to Orange Bus Service");
}

@Override
public void book() {
	// TODO Auto-generated method stub

	bookBusTicket();
}



}

class AutoTravels implements AutoServices
{

	@Override
	public void book() {
		// TODO Auto-generated method stub
	bookAuto();	
	}

	@Override
	public void bookAuto() {
		// TODO Auto-generated method stub
		System.out.println("u have hired a Auto");
	}
	
	
	
}

// Now we have to tell the CabOperator in the market to use this Service and writer ur own Implementation

class OlaTravels implements CarService
{
public void bookCab()
{
System.out.println("Welcome to Ola Service,enjoy the Ride!!!!!!!");
}
public void book() 
{
	// TODO Auto-generated method stub

	bookCab();
}

}



// Now we have to tell the FlightOperator in the market to use this Service and writer ur own Implementation


class Indigo implements FlightServices
{
public void bookFlight()
{
System.out.println("Welcome to  Indigo Flight,Have a Safe and Helathy flight!!!!!!!");
}
public void book()
{
	bookFlight();
}


}


class BookingApp 
{
private TransportServices tref;

BookingApp(TransportServices tref)
{
this.tref=tref;
}

public void selectedService()
{
	tref.book();
	
	
}


}










public class TransportMainApp 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//1. Customer want to book Fligt Service
		OlaTravels ola=new OlaTravels();
		
		BookingApp obj=new BookingApp(new AutoTravels());
					obj.selectedService();
		
	}

}
