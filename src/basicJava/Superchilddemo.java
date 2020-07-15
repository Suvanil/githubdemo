package basicJava;

public class Superchilddemo extends ParentDemo{

	
	String name="Suvanil";
	
	public Superchilddemo()
	{
		super();
		System.out.println("child constucter");
		
	}
	
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	public void nameprint()
	
	{
		super.nameprint();
		System.out.println("I am child class");
		
		
	}
	public static void main(String[] args) {

		Superchilddemo scd= new Superchilddemo();
	scd.getData();
	scd.nameprint();
	
	
	
	}

}
