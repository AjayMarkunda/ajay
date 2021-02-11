package pack;

interface aj {
	void sum();

}
public class Int1 implements aj
{
    public void sum()
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String [] args)
	{
		Int1 in = new Int1();
		in.sum();
	}
}
