
public class Operator {
	public static void main(String [] args)
	{
		int i=0;
		int a=4;
		int b=2;
		System.out.println("i is "+i);
		System.out.println("++i is "+ ++i);
		System.out.println("i++ is "+i++);
		System.out.println("--i is "+--i);
		System.out.println("i-- is "+i--);
		System.out.println("a*b is "+a*b);
		System.out.println("a/b is "+a/b);
		System.out.println("a%b is "+a%b);
		System.out.println("a+b"+(a+b));
		System.out.println("a-b"+(a-b));
		if(a>b)
		System.out.println("a is greater");
		if(b>a)
			System.out.println("b is greater");
		if(a==b)
			System.out.println("a and b are not equal");
		if(a>b&&a>i)
			System.out.println("a is greater than b and a is greater than i");
		System.out.println(a>b?a:b);
	}
	
}
