package programs;

public class AreaO {
	//Q1:Write a program to find area of triangle, Rectangle and square. 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaO a=new AreaO(8,6);
		AreaO b=new AreaO(4,6);

	}
	
	public AreaO(int l,int b){
		int area=l*b;
		System.out.println("Area of Triangle is: "+area);
		
	}
	/*public AreaO(int w,int l){
		int area=w*l;
		System.out.println("Area of rectangle is :"+area);
		
	}*/

}
