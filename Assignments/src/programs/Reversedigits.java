package programs;

public class Reversedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=126;
		String s=Integer.toString(a);
		for(int i=s.length()-1;i>=0;i=i-1){
			System.out.println(s.charAt(i));
			//System.out.println(a.length);
			
		}

	}

}
