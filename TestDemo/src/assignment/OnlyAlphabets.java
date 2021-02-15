package assignment;
import java.util.*;

public class OnlyAlphabets {
	public static void main(String[] args) {
	System.out.println("Enter the string to check");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int count = 0;
	char check[] = str.toCharArray();
	for (int i = 0; i <= str.length()-1; i++)
	{
	if (check[i] >= 'a' & check[i] <= 'z' || check[i] >= 'A' & check[i] <= 'Z')
	{

	} 
	else
	{
	count++;
	}

	}
	if(count ==0)
	{
	System.out.println("Given string contains only alphabets");
	}
	else
	{
	System.out.println("Given string contains special characters or numbers ");
	}
	sc.close();}
	}


