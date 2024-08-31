import java.util.*;
class  GoibiboClient
{
	public static void main(String[] args) 
	{
		MalayaService is1 = MalayaFactory.getMalayaService();
		MalayaService is2 = MalayaServiceFactory.getMalayaServiceV2();
		List<Flight>MalayaFlightsV1 = is1.getFlights();
		List<Flight>MalayaFlightsV2 = is2.getFlights();
		System.out.println("Flights from Sevice 1");
		System.out.println(MalayaFlightsV1);
		System.out.println();
		System.out.println("Flights from Service 2");
		System.out.println(MalayaFlightsV2);
	}
}
