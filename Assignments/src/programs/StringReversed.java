package programs;

public class StringReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Code";
		String[] s1=s.split(" ");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		
		
		
		for(int i=s1.length-1;i>=0;i=i-1){
			//System.out.print(s1[i]);
			String s2=s1[i];
			for(int j=s2.length()-1;j>=0;j=j-1){
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
