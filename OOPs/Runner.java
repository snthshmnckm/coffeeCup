class Runner 
{
	public static void main(String[] args) throws Exception
	{
		Object obj= Class.forName(args[0]).newInstance();
		Servlet S=(Servlet)obj;
		S.Service();
	}
}
