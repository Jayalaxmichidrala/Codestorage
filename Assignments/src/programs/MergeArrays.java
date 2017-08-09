package programs;

public class MergeArrays {
	
	public static void main(String []args){
	int[] a=new int[]{2,8,9,5};
	int [] b=new int[]{3,1,10,4,7};
	int [] c=new int[a.length+b.length];
	int count=0;
	
	for(int i=0;i<a.length;i=i+1){
		c[i]=a[i];
		//a[i]=c[i];
		count=count+1;
		System.out.println("first"+a[i]);
		System.out.println(count);
		
		
		
	}
	
	for(int j=0;j<b.length;j=j+1){
		c[count++]=b[j];
		System.out.println("second"+c[j+a.length]);//here we are giving c[j] means j starts from 0 so in c[0123] 
		//val=a array values.
	}
	
	for(int i=0;i<c.length;i=i+1){
		System.out.print(c[i]+" ");
	}
	
	

}
}
