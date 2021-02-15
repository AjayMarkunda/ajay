package assignment;
public class Unique {
	
	public static void main(String[] args) {
		String []str = new String[4]; 
		str[0] = "AMSTERDAM";
		str[1] = "ILLIIONOS";
		str[2] = "COSMOS";
		str[3] = "EPIDEMICPANDEMIC";
		int count=0;
		char s;
		//String s3 = new 
		String []str1 = new String[5]; 
		str1[0] = "";
		str1[1] = "";
		str1[2] = "";
		str1[3] = "";
		String []str2 = new String[4]; 
		str2[0] = "";
		str2[1] = "";
		str2[2] = "";
		str2[3] = "";
		for(int j=0;j<4;j++)
		{
			for(int i=0;i<str[j].length();i++)
			{count=0;
				for(int k=0;k<str[j].length();k++)
				{
					if(str[j].charAt(i)==str[j].charAt(k))
					{
					 count++;
					}
				}
				if(count==1)
				{
				s =str[j].charAt(i);
			
				str2[j]=Character.toString(s);
				str1[j]=str1[j].concat(str2[j]);
				}
				
			}
			System.out.println(str1[j]);
			}
		
	}
}
