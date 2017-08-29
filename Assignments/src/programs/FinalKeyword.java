package programs;

public class FinalKeyword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   final int i=10;
		//int i=20;//compilation error
		try{
		int j=31;
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("this will be executed");
		}
	

	}

}
