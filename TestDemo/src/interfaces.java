

interface aj {
	void sum();

}
public class interfaces implements aj
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
		interfaces in = new interfaces();
		in.sum();
	}
}
