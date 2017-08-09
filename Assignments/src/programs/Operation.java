package programs;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//int x=5;
			Operation o =new Operation();
			int z;
			z=o.subtract(17,4);
			System.out.println(z);
			o.divide(12, 3);
			int d=o.divide(12, 3);
			System.out.println(d);
	}
			/** subtract **/
			public int subtract(int x,int y) {
				System.out.println(x);
				return x + negate(y);
				//System.out.println(x);
			}
			
			public int negate(int x) {
				System.out.println(x);
				int result = 0;
				int temp = x < 0 ? 1 : -1;
				while (x != 0) {
					x += temp;
					result += temp;
					System.out.println("temp :" + temp +" Result : "+ result);
				}
				return result;
				

}
			public int divide(int x,int y){
				if(y==0){
					throw new ArithmeticException("Arthematic exception");
				}
				int absx=Math.abs(x);
				int absy=Math.abs(y);
				
				int product=0;
				int result=0;
				while(product+absy<=absx){
					product=product+absy;
					result++;
				}
				//System.out.println(result);
				if((x>0 && y>0) ||(x<0 &&y<0)){
					return result;
				}
				else {
					return negate(result);
				}
			}
			
}
