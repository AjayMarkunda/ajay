import java.util.Scanner;

public class Onemanyasso {
public static void main(String[] args) {
	employee e1[] = new employee[3];
	e1[0] = new employee(0,8,2020,"pavan");
	e1[1] = new employee(1,9,2019,"ajay");
	e1[2] = new employee(2,8,2020,"srikanth");
	company techouts = new company();
	for(int i=0;i<3;i++)
	{
		if(i==techouts.write(e1))
		{
	techouts.write(e1);
}
	}
}
}
class employee
{
	int rating;
	int id;
	int startyear;
	String name;
	employee(int id,int rating,int startyear,String name)
	{
		this.id=id;
		this.rating=rating;
		this.startyear=startyear;
		this.name=name;
	}
	public String getInfo()
	{
		return "ID:"+this.id+"\nrating:"+this.rating +"\nstartyear: "+this.startyear+"\nname: "+this.name;
	}
	}
class company
{
	public int write(employee e1[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp id");
		int n = sc.nextInt();
		for(int j=0;j<3;j++)
		{
		if(n==e1[j].id)
		{
			System.out.println(e1[j].getInfo());
		}
		}
		sc.close();
		return n;
		
	}
}
