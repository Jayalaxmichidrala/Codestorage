package programs;

import java.util.Random;

public class Randomnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int num;
		
		for(int i=1;i<=10;i=i+1){
			num=rand.nextInt(50);//50 means it will give the numbers from 0 to 50
			//num=1+rand.nextInt(50);//if you dont want 0 then it is the syntax
			System.out.println(num);
		}

	}

}
