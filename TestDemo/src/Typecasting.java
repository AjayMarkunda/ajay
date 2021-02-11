
/*public class TypeCasting {
	public static void main(String[] args) {
		int a;
		float b=97.8f;
		a=(int)b;
		
		System.out.println("typecasted value of 97.8 is "+a);
		char c =(char)a;
			System.out.println("typecasting of int to char "+c);
				}

}*/
class Super {
	void Sample() {
		System.out.println("method of super class 1");
	}
	void superclass()
	{
		System.out.println("methos of super class 2");
	}
	}
public class Typecasting extends Super {
	void Sample() {
		System.out.println("method of sub class");
	}
	

	public static void main(String args[]) {
		Typecasting type1 = new Typecasting();
		type1.Sample();
		type1.superclass();
		Super spr = new Super();
		spr.
		
		Super obj =(Super) type1; 
		obj.Sample();
		obj.superclass();
	}
}