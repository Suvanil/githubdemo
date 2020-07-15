package basicJava;

public class thisDemo {
	int a=4;
	
	public void getdata()
	{
		
	int a =3;
	System.out.println(a);
	System.out.println(this.a);
	
	System.out.println(this.a + a);
		
	}
	
	
	
	public static void main(String[] args) {
		

		thisDemo td=new thisDemo();
		td.getdata();
	}

}
