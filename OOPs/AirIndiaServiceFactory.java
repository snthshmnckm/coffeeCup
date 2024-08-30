class AirIndiaServiceFactory 
{
	public static  AirIndiaService getAirIndiaService()
	{
		return new  AirIndiaServiceImpl();
	}
	public static AirIndiaService getAirIndiaServiceV2(){
		return new AirIndiaServiceImplV2();	
	}
}
