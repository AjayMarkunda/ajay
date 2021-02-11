import java.util.Scanner;

public class throww {
	int age;
	 throww(int age)
	{
		this.age=age;
		if(age<5)
			throw new ArithmeticException("\n-_- go to school first");
			
		else if(age<18)
			throw new ArithmeticException("\nyou're too young to VOTE!!!!!!!");
		else 
			System.out.println("u can vote");
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int m=sc.nextInt();
		throww th = new throww(m);
		System.out.println();
		//th.voter(m);
		System.out.println("-------------------------------------------------");
		sc.close();
	}
}
