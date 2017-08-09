package polymorphisam;

public abstract class Management {
	


public abstract void message();
//if it is abstract method then we should not define the body here(only declaration).should define the body in child classes
public void day(){
	System.out.println("today is friday");//if it is normal method then definitely we should define the body here

}
public void smessage(){
	System.out.println("Sceretmessage");
	//if we want to give any imp info we should create interface and define those methods in child classessince interface by default abstract.

}
public void add(){
	System.out.println("This is parent add");
}

}
