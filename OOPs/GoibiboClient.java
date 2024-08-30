import java.util.*;
class  GoibiboClient
{
	public static void main(String[] args) 
	{
		AirIndiaService is1 = AirIndiaServiceFactory.getAirIndiaService();
		AirIndiaService is2 = AirIndiaServiceFactory.getAirIndiaServiceV2();
		List<Flight>AirIndiaFlightsV1 = is1.getFlights();
		List<Flight>AirIndiaFlightsV2 = is2.getFlights();
		System.out.println("Flights from Sevice 1");
		System.out.println(AirIndiaFlightsV1);
		System.out.println();
		System.out.println("Flights from Service 2");
		System.out.println(AirIndiaFlightsV2);
	}
}
