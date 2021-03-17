package newCapg;

import java.util.Scanner;

public class TeamMain {

	public static void main(String args[]) {

		team();

	}
	static void team()
	{
		Team obj=new Team();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter team name, coach name, location, players name and captain name");
		String name= scanner.next();
		obj.setName(name);
		String coach= scanner.next();
		obj.setCoach(coach);
		String location= scanner.next();
		obj.setLocation(location);
		String players= scanner.next();
		obj.setPlayers(players);
		String captain= scanner.next();
		obj.setCaptain(captain);
		obj.displayTeamDetails();
		scanner.close();
	}
}
