package programs;
//WJP about 2 arrys and compare 2 arrys if we have same value in same position it need to print true otherwise it should print false
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the a values"+"\n");
		//int n=sc.nextInt[];
		int [] a=new int[3];
		int [] b=new int[3];
		for(int j=0;j<=(a.length)-1;j=j+1){
			 a[j]=sc.nextInt();
			//System.out.println(j);
		}
		System.out.println("enter b values");
		for(int k=0;k<=(b.length)-1;k=k+1){
			b[k]=sc.nextInt();
			System.out.println(k);
		}
		//comparing two arrays
		for(int i=0;i<=a.length-1;i=i+1){
			if(a[i]==b[i]){
				System.out.println("true");
				System.out.println(a[i]);
			}
			else{
				System.out.println("false");
			}
		}

}
}