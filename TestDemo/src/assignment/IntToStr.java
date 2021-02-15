package assignment;
import java.util.*;

class IntToStr
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int a = sc.nextInt();
String str = Integer.toString(a);
String str1 = String.valueOf(a);
System.out.println(str);
System.out.println(str1);

sc.close();
}
}
