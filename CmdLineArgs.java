class CmdLineArgs{
	public static void main(String[] args){
		if(args.length>0){
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(Double.parseDouble(args[1]));
		}
	}
}

