package pack;

import java.util.Scanner;

public class PrimeNum 
{
	public static void main(String[] args) 
	{
		int[] a = new int[50];
		int z=0;
		for(int n=1;n<=100;n++)
		{
			int count = 0;
			
		
			for(int i=1;i<=n;i++)
			{
				if(n%i == 0)
				{
					
					count++;
				}
			}
		
		if(count == 2)
		{
			System.out.print(n+" ");
			a[z]=n;
	
		}
		
	}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		int[] a1 = new int[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the index");
		int index = scan.nextInt();
		for(int i=0;i<=a.length-1;i++)
		{
			if(index == a[i])
			{
				System.out.println(a[i]);
			}
		}
		
		
		
	  }
		
		
		
	}


