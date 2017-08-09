package programs;

import java.util.Scanner;

public class OccuranceOfNUMBERS {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		int[] arr=new int[]{1,6,3,1,6,7,6,8};
		int count=0;
		for(int i=0;i<=arr.length-1;i=i+1){
			count=1;
			for(int j=0;j<=arr.length-1;j=j+1){
				if(i!=j && arr[i]==arr[j] && j>i){
					//System.out.println(arr[i]+"passs");
					count=count+1;
					System.out.println(arr[i]+"passs"+count);
				}
				else if (i<j && arr[i]==arr[j]){
				 break;
					//System.out.println("fail");
				}
			}
		}*/
		
		
		Scanner sc = new Scanner(System.in);

        int[] array = new int[50];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < array.length; i++) {
            int a = sc.nextInt();
            array[a] += a;
            if (a == 0)
                break;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                if (array[i] / i > 1)
                    System.out.println(i + " occurs " + array[i] / i + " times");
                else
                    System.out.println(i + " occurs " + array[i] / i + " time");
                }
        }
    }
	

}


