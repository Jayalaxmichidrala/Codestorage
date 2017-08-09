package polymorphisam;

public class Security extends Management {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Employees get 1 WFH");
	}
	public void add(){
		System.out.println("This is child add method");
	}
	public static void main(String[]args){
		Security s=new Security();
		s.add();//it will calls the child method .
		
		
	
	}
	

}
