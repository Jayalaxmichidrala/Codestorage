package programs;

public class Biggestnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=26;
		int b=200;
		int c=20;
		if(a!=b && b!=c && a!=c){
		if(a>b && a>c){
			System.out.println("a is the first big"+a);
			
		}
		else if(b>c && b>a){
			System.out.println("b is the biggest"+b);
			
		}
	     else{
			System.out.println("c is the biggest");
		}

	}
		else{System.out.println("wrong input");}
}
}



