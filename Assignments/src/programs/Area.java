package programs;

//Q1:Write a program to find area of triangle, Rectangle and square. 
//done without using Constructor(explicitly)

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.triangle(5, 3);
		a.rectangle(7, 3);
		a.square(4);
		

	}
	
	public void triangle(int l, int b){
		int a=l*b;
		System.out.println("Area of Triangle is: " +a);
	}
	public void rectangle(int l,int w){
		int a=l*w;
		System.out.println("Area of Rectangle is: "+ a);
	}
	public static void square(int l){
		int a=l*l;
		System.out.println("Area of Square is :"+a);
	}

}
