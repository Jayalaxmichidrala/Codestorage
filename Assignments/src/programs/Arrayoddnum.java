package programs;

public class Arrayoddnum {
	//WJP to print odd or even numbers in given array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[3];
		a[0]=9;
		a[1]=8;
		a[2]=7;
		System.out.println(a[2]);
		for(int i=0;i<=a.length-1;i=i+1){
			if (a[i]%2!=0){
				System.out.println(a[i]);
				System.out.println("odd");
				
			}
		}

	}

}
