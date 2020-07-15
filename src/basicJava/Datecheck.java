package basicJava;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Datecheck {
 
 public static void main(String[] args) {
 
Date d=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("d/MM/yyyy hh:mm:ss");
System.out.print(sdf.format(d));
 
 }
 
}