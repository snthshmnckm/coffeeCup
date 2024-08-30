import java.util.*;
class  AirIndiaServiceImplV2 implements AirIndiaService
{
	public List<Flight>getFlights()
	{
		List<Flight>flights=new LinkedList<>();
		flights.add(new Flight("E1001","AirIndia","Chennai","Delhi"));
		flights.add(new Flight("E1002","AirIndia","Delhi","Jammu&Kashmir"));
		flights.add(new Flight("E1003","AirIndia","Jammu&Kashmir","Chennai"));
		flights.add(new Flight("E1004","AirIndia","Chennai","Kolkata"));
		return flights;
}
}