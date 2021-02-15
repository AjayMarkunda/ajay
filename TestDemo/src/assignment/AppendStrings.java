package assignment;

import java.util.*;
public class AppendStrings {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 10 strings");
	String [] str = new String[10];
	for(int i=0;i<10;i++)
	{
	   str[i]=sc.next();
	}
	for(int j=1;j<10;j++)
	{
	   str[0]=str[0].concat(str[j]);
	}
	System.out.println(str[0]);
	sc.close();
	}
	}
	


