package inheritance.and.polymorphism;

import java.util.Scanner;

public class PlayerDetails {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String args[])
	{
		
		System.out.println("Menu\n"
				+ "1.Cricket Player Details\n"
				+ "2.Hockey Player Details"+"\n Enter your choice");
		int choice=Integer.parseInt(scanner.nextLine());
		
		if(choice==1)
		{
			cricket();
		}
		else if(choice==2)
		{
			hockey();
		}
	}
	
	static void cricket()
	{
		String name;
		String teamName;
		int noOfMatches, totalRunsScored, noOfWicketsTaken;
		System.out.println("Enter player name:");
		name= scanner.nextLine();
		System.out.println("Enter team name:");
		teamName=scanner.nextLine();
		System.out.println("Enter number of matches played:");
		noOfMatches=Integer.parseInt(scanner.next());
		System.out.println("Enter total runs scored : ");
		totalRunsScored=Integer.parseInt(scanner.next());
		System.out.println("Enter total number of wickets taken : ");
		noOfWicketsTaken=Integer.parseInt(scanner.next());
		CricketPlayer obj=new CricketPlayer(name, teamName,noOfMatches,totalRunsScored,noOfWicketsTaken);

		obj.displayPlayerStatistics();
		
	}
	
	static void hockey()
	{
		String name;
		String teamName,position;
		int noOfMatches, noOfGoals;
		System.out.println("Enter player name: ");
		name= scanner.nextLine();
		System.out.println("Enter team name: ");
		teamName=scanner.nextLine();
		System.out.println("Enter number of matches played: ");
		noOfMatches=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter the position: ");
		position=scanner.nextLine();
		System.out.println("Enter total number of goals taken: ");
		noOfGoals=Integer.parseInt(scanner.nextLine());
		HockeyPlayer obj=new HockeyPlayer(name, teamName,noOfMatches,noOfGoals,position);

		obj.displayPlayerStatistics();
		
	}
	
}

interface IPlayerStatistics {
	public void displayPlayerStatistics();
	
}

abstract class Player {
	protected String name;
	protected String teamName;
	protected int noOfMatches;

	public Player(String name, String teamName, int noOfMatches) {
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}

}

class CricketPlayer extends Player implements IPlayerStatistics {
	private int totalRunsScored, noOfWicketsTaken;
public void displayPlayerStatistics() {
	System.out.println("Player name: "+name+"Team name : "+teamName+"No of matches : "+noOfMatches+ "Total runsscored : "+ totalRunsScored+"No of wickets taken :"+noOfWicketsTaken);
}
	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.noOfMatches = noOfMatches;
		this.noOfWicketsTaken = noOfWicketsTaken;
		displayPlayerStatistics();
		// TODO Auto-generated constructor stub
	}
}

	class HockeyPlayer extends Player implements IPlayerStatistics{
		private int noOfGoals;
		private String position;
		public void displayPlayerStatistics(){
			System.out.println("Player name: "+name+"Team name : "+teamName+"No of matches : "+noOfMatches+ "Total No of goals : "+ noOfGoals+"Position :"+position);
			}

		HockeyPlayer(String name, String teamName, int noOfMatches,int noOfGoals,String position) {
			super(name, teamName, noOfMatches);
			this.noOfGoals=noOfGoals;
			this.position=position;
		
			// TODO Auto-generated constructor stub
		}
	}

