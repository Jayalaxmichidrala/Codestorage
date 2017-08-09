package programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MalayalaM";
		char s1;
		char s2;
		int value=0;
		
		for(int i=0;i<=s.length()-1;i=i+1){
			s1=s.charAt(i);
			s2=s.charAt(s.length()-1-i);
			if(s1!=s2){
				value=1;
			}
	
			//System.out.println(s1);
			
			System.out.println(s2);
			
		}
		if (value==0){
			System.out.println("This is polyndrome");
		}
		else{System.out.println("This is not Polyndrome");}
	

	}
	

}
