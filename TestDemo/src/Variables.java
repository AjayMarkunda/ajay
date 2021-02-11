import java.util.*;
public class Variables {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=100;
		int b=111;
		System.out.println("enter value");
		String c = sc.nextLine();
				switch(c)
				{
				case "100":
					System.out.println(c+" is the value of 'a'");
					break;
				case "111":
					System.out.println(c+" is the value of 'b'");
					break;
					default:
						System.out.println("you entered wrong input!!");
						break;
						
				}
				sc.close();
			
	}

}
