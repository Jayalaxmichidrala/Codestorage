package programs;

public class ConvertInttoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 12156789;
		String s1=Integer.toString(i);
		System.out.println(s1);
		int j;
		for(j=0; j<=s1.length()-1; j=j+1){
		switch(s1.charAt(j)) {
		
		 case'1':
			System.out.println("One");
			break;
		 case'2':
			System.out.println("five");
			break;
		 case'3':
			System.out.println("Three");
			break;
		 case'5':
			 System.out.println("five");
		}

	}

}
}
