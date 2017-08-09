package programs;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="tekarch";
		String s2="tekarch";
		
		String c="nul";
		String c1=null;
		
		if(c!= null){
			System.out.println(c1);
		}
		
		String s3="abc";
		String s4=new String("tekarch");
		String s5=new String("tekarch");
		
		//equals method
		System.out.println("c caompare c1 using equale methiod "+c.equals(c1));
		System.out.println("s1 caompare s2 using equale methiod "+s1.equals(s2));
		
		System.out.println("s1 caompare s3 using equale methiod "+s1.equals(s3));
		System.out.println("s1 caompare s4 using equale methiod "+s1.equals(s4));
		System.out.println("s4 caompare s5 using equale methiod "+s4.equals(s5));
		System.out.println(s1==s3);
		System.out.println(s4==s5);
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+" "+s1);
		
		//hashcode comparison
		
		//s1.hashCod())==s2.hashCode();
		
		//equls operator
		if( s1== s2){
			System.out.println("true");
			
		}

	}

}
