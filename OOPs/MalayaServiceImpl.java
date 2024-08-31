import java.util.*;
class  MalayaServiceImpl implements MalayaService
{
	public List<Flight>getFlights()
	{
		List<Flight>flights=new ArrayList<>();
		flights.add(new Flight("E1001","AirIndia","Chennai","Delhi"));
		flights.add(new Flight("E1002","AirIndia","Delhi","Jammu&Kashmir"));
		flights.add(new Flight("E1003","AirIndia","Jammu&Kashmir","Chennai"));
		return flights;
}
}
