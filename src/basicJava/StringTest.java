package basicJava;

public class StringTest {

public static void main(java.lang.String[] args) {
		
String a= "Suvanil";
String b="Chakraborty";


System.out.println(a.charAt(2));
System.out.println(b.indexOf("k"));
System.out.println(a.substring(2,7));
System.out.println(a.substring(0));
System.out.println(a.concat(b));
String c=a+" " +b;
System.out.println(c);
System.out.println(a.length());
System.out.println(b.length());
System.out.println(c.trim());
System.out.println(a.toUpperCase());
System.out.println(b.toLowerCase());
String d[]=c.split(" ") ;
System.out.println(d[0]);
System.out.println(d[1]);
System.out.println(a.replace("v","bh"));
}

}
