package assignment;
import java.util.*;
class DoubToStr
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter double value");
Double d = sc.nextDouble();
String str = Double.toString(d);
String str1 = String.valueOf(d);
System.out.println(str);
System.out.println(str1);
System.out.println("enter a astring");
String st = sc.next();
Double doub = Double.parseDouble(st);
System.out.println(doub);

sc.close();
}
}
