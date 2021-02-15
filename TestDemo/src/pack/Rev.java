package pack;
import java.util.*;

public class Rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		for(int i=((str.length())-1);i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
	sc.close();
	}

}
