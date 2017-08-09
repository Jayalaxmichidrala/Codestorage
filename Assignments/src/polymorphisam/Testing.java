package polymorphisam;

public class Testing {
	public static void main(String[] args){
		Management john=new IT();
		Management steve=new Accounts();
		Management bob=new Security();
		
		john.message();
		steve.message();
		bob.message();
		
		john.day();
		steve.day();
		bob.day();
		
		steve.smessage();
		
	}

}
