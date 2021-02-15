package pack;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter list of numbers");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(50);
		
		while(sc.hasNextInt())
		{
		      numbers.add(sc.nextInt()); 
		      
		}
		
		System.out.print(Collections.max(numbers));
		System.out.print(numbers);
		numbers.forEach(n-> {System.out.print(n+" ");});
		sc.close();
}		
}

