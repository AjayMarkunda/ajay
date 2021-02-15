package assignment;

import java.util.Scanner;
class Batsmen2 {
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;

	public Batsmen2(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		super();
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}

	public Batsmen2() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

}

public class T2_Batsman {

	public static void main(String[] args) {
		Batsmen2 b[] = new Batsmen2[2];
		b[0] = new Batsmen2("sehwag", 219, 1, 1, 128, 15, 10);
		b[1] = new Batsmen2("Raina", 219, 1, 1, 128, 15, 10);
		Scanner sc = new Scanner(System.in);
		for (int k = 0; k <= 1; k++) {
			/*
			 * b.getName(); b.getRunsScored(); b.getCenturies(); b.getHalfCenturies();
			 * b.getFours(); b.getSixes();
			 */
			System.out.println("Batsmen Name:" + b[k].getName());
			System.out.println("runs scored :" + b[k].getRunsScored());
			System.out.println("centuries:" + b[k].getCenturies());
			System.out.println("HalfCenturies:" + b[k].getHalfCenturies());
			System.out.println("Balls Faced:" + b[k].getBallsFaced());
			System.out.println("Fours:" + b[k].getFours());
			System.out.println("Sixes:" + b[k].getSixes());
		}
		sc.close();
	}
}
