package programs;

public class Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=9;
		for (int i=1; i<9;i=i+1){
			for (int j=1; j<9;j=j+1){
				if(i+j==9){
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
