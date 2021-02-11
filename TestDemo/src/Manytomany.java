import java.util.Scanner;

public class Manytomany {
	public static void main(String[] args) {
		books e1[] = new books[3];
		e1[0] = new books(0,8,6,"intro to c");
		e1[1] = new books(1,9,4,"intro to java");
		e1[2] = new books(2,8,5,"into to c");
		
		students s1[] = new students[3];
		s1[0] = new students(0,8,6,"ajay");
		s1[1] = new students(1,9,4,"pavan");
		s1[2] = new students(2,8,5,"srikanth");
		System.out.println("whose id do you have book or trainee");
		Scanner sc1 = new Scanner(System.in);
		String input = sc1.next();
		switch(input)
		{
		case "book":
			for(int i=0;i<3;i++)
			{
				if(i==s1[i].write(e1))
			{
				s1[i].write(e1);
				System.out.println(e1[i].getInfo());
				
			}
			}
			System.exit(0);
		case "trainee":
			for(int g=0;g<3;g++)
			{
				if(g==e1[g].write(s1))
			{
					
				e1[g].write(s1);
				System.out.println(s1[g].getInfo());
			
			}
			}
			
			System.exit(0);
		}
		sc1.close();
		
		//---------------------------------------------------
		
	
	}
	
	}
	class books
	{
		int count=-1;
		int rating;
		int id;
		int transaction_id;
		String name;
		books(int id,int rating,int transaction_id,String name)
		{
			this.id=id;
			this.rating=rating;
			this.transaction_id=transaction_id;
			this.name=name;
		}
		public String getInfo()
		{
			return "ID: "+this.id+"rating: "+this.rating+"transaction_id: "+this.transaction_id+"name: "+this.name;
		}
		public int write(students s1[])
		{
			count++;
			Scanner sc = new Scanner(System.in);
			
			//-------------------------------------------------
			System.out.println("enter trainee id");
			int m = sc.nextInt();
			for(int o=0;o<3;o++)
			{
			if(m==s1[o].id)
			{
				System.out.println(s1[o].getInfo());
			
				
			}
			}
			//System.out.println(e1.getInfo());
			sc.close();
			if(count==m)
			{ 
			return m;
			}
			else
			{
				System.out.println("ID: "+this.id+"rating: "+this.rating+"transaction_id: "+this.transaction_id+"name: "+this.name);
			return 0;
			}
		}
		}
	class students
	{
		int id;
		int standard;
		int transaction_id;
		String name;
		students(int id,int standard,int transaction_id,String name)
		{
			this.id=id;
			this.standard=standard;
			this.transaction_id=transaction_id;
			this.name=name;
		}
		public String getInfo()
		{
			return "ID:"+this.id+"\nstandard:"+this.standard +"\ntransaction_id: "+this.transaction_id+"\nname: "+this.name;
		}
		public int write(books e1[])
		{
			Scanner sc = new Scanner(System.in);
			
			//-------------------------------------------------
			System.out.println("enter book id");
			int n = sc.nextInt();
			for(int j=0;j<3;j++)
			{
			if(n==e1[j].id)
			{
				System.out.println(e1[j].getInfo());
		
			}
			}
			//System.out.println(e1.getInfo());
			sc.close();
			return n;
			
		}
	}

