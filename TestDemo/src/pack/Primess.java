package pack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primess {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("specify the range you want to check for prime numbers");
		int n = sc.nextInt();
		int count=0;
		int bount=0;
		System.out.println("enter which prime number do you want");
		int b= sc.nextInt();
		int a[] = new int[100];
		List<Integer> a1 = new ArrayList<>();
		for(int i =2;i<=n;i++)
		{ 
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				bount++;
				a[bount]=i;
			}
			}
		for(int k=1;k<=n;k++)
		{
			if(k==b)
				System.out.println(a[k]+" is the "+b+"th prime number");
	}
		sc.close();
	}
	}
