package programs;

public class Arraysumtoeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		int[] a=new int[5];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=2;
		a[4]=9;
		for(int i=0;i<=a.length-1;i=i+1){
			//System.out.println(a[i ]);
			for(int j=i+1; j<=a.length-1;j=j+1)
			{
				if((a[i]+a[j])%2 == 0){
					cnt =cnt+1;
				}
			}
		}
		System.out.println("Total Count " + cnt);

	}

}
