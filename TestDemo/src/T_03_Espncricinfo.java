
import java.text.DecimalFormat;
import java.util.Scanner;

import com.sun.tools.javac.launcher.Main;

class Batsman {
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;

	private int id;

	private static int idGenerator = 100000;

	public Batsman() {
		this.id = ++idGenerator;
	}

	public Batsman(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		this.id = ++idGenerator;
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}

	public Batsman getData() {
		return this;
	}

	public float getStrikeRate() {
		
		return (this.runsScored/100)*this.ballsFaced;
	}

	public int getRunsScoredInBoundaries() {
		return (this.fours * 4) + (this.sixes * 6);
	}

	public String getName() {
		return name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public int getSixes() {
		return sixes;
	}

	public int getId() {
		return id;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public static void setIdGenerator(int idGenerator) {
		Batsman.idGenerator = idGenerator;
	}

}

class Espncricinfo {
	int count=-1;
private final int SIZE =50;
private Batsman[] batsmans;	
private int noOfBatsmen;
String name;
int runsScored;
int centuries;
int halfCenturies;
int ballsFaced;
int fours;
int sixes;
Batsman[] getBatsmans()
{
	return Batsman[];
}
int getNoOfBatsmen()
{
	return noOfBatsmen;
	}
int addBatsman(String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes)
{
	Scanner sc= new Scanner(System.in);
	this.name=name;
	this.runsScored=runsScored;
	this.centuries=centuries;
	this.halfCenturies=halfCenturies;
	this.ballsFaced=ballsFaced;
	this.fours=fours;
	this.sixes=sixes;
	Batsman b[];
	b[] = Batsman(this.name,this.runsScored,this.centuries,this.halfCenturies,this.ballsFaced,this.fours,this.sixes);
	count=1;
	
	if(noOfBatsmen<(SIZE-1))
	{
		for(int h=noOfBatsmen;h<SIZE;h++)
		{ 
			count++;
			System.out.println("enter name,runs scored,centuries,half centuries,balls faced,fours,sixes");
			this.name=sc.next();
			this.runsScored=sc.nextInt();
			this.centuries=sc.nextInt();
			this.halfCenturies=sc.nextInt();
			this.ballsFaced=sc.nextInt();
			this.fours = sc.nextInt();
			this.sixes = sc.nextInt();
			b[] = Batsman(this.name,this.runsScored,this.centuries,this.halfCenturies,this.ballsFaced,this.fours,this.sixes);
		}
	}
	
	}
		
	else 
	{
		return 0;
	}
	//"noOfBatsman" is less than SIZE-1, add to the array and return an id of  added Batsman, else return zero.
	}
Batsman updateBatsmanStats(int id,int runsScored,int fours,int sixes,int ballsFaced)
{ 
	this.id=id;
	this.runsScored=runsScored;
	this.fours=fours;
	this.sixes=sixes;
	this.ballsFaced= ballsFaced;
	//If batsmanId found, update stats and return object, else return "null" 
	}
Batsman getBatsman(int batsmanId)
{
	int batsmanId;	
	//-----------------------
	System.out.println("enter book id");
	int n = sc.nextInt();
	for(int j=0;j<3;j++)
	{
	if(n==e1[j].id)
	{
		System.out.println(e1[j].getInfo());

	}
	//If batsmanId found, return object of type Batsman, else return "null"
	
}
}

public class T_03_Espncricinfo {
	public static void main(String[] args) {
		
		Espncricinfo espncricinfo = new Espncricinfo();
		espncricinfo.addBatsman("AB de Villers", 687, 1, 6, 407, 57, 37);
		espncricinfo.addBatsman("Virak Kohli",  973, 4,7, 670, 83, 38);
		espncricinfo.updateBatsmanStats(100001, 45, 5, 1, 33);
		
		Batsman batsman = espncricinfo.getBatsman(100001);
		if(null != batsman){
			System.out.println("ID :"+batsman.getId());
			System.out.println("Name :"+batsman.getName());
			System.out.println("BallsFaced :"+batsman.getBallsFaced());
			System.out.println("Centuries :"+batsman.getCenturies());
			System.out.println("HalfCenturies :"+batsman.getHalfCenturies());
			System.out.println("Fours :"+batsman.getFours());
			System.out.println("Sixes :"+batsman.getSixes());
			System.out.println("RunsScoredInBoundaries :"+batsman.getRunsScoredInBoundaries());
			System.out.println("RunScored :"+batsman.getRunsScored());
			System.out.println("StrikeRate :"+batsman.getStrikeRate());
	
		} else{
			System.out.println("No Batsman found with given id !!! ");
		}
		
	}
}
