package polymorphisam;

public class Cexample extends PolyEx {
	int i=2;
	
	public void add(){
		System.out.println("This is child add method");
	}
	public void sub(){
		System.out.println("This is child sub method");
	}
	public static void main(String[] args){
		//parent class objects
		PolyEx p=new PolyEx();//this will call parent met..as we created object by using parent class
		p.add();
		p.dev();
		System.out.println(p.i);
	//IMP	//p.sub()//here it will give error b/c sub method dont have in Superclass.
		//Child class objects
		Cexample c=new Cexample();//this will call child method
		c.add();
		c.dev();//it will take b/c acquires all props from parent
		c.sub();
		System.out.println(c.i);
		PolyEx p1=new Cexample();//
		p1.add();//here child class method will be execute.
		p1.dev();
		System.out.println(p1.i);
		//Cexample c1=new PolyEx();//this is wrong we cannot use 
	}

}
