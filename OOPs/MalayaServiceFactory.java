class MalayaServiceFactory 
{
	public static  MalayaService getMalayaService()
	{
		return new  MalayaServiceImpl();
	}
	public static MalayaService getMalayaServiceV2(){
		return new MalayaServiceImplV2();	
	}
}
