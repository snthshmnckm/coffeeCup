class Flight
{
	String Fno;
	String Fname;
	String FSource;
	String FDestination;
	
	Flight(String Fno,String Fname,String FSource,String FDestination){
		this.Fno = Fno;
		this.Fname = Fname;
		this.FSource = FSource;
		this.FDestination = FDestination;
	}
	@Override
		public String toString(){
		return  "Flight No = " + this.Fno +  ",Flight Name = " + this.Fname	+ ",Flight Source = " + this.FSource + ",Flight Destination = " + this.FDestination;
	}
	
}  

