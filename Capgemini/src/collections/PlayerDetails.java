package collections;
import java.util.*;
class Player {

	String name,country,skill;

	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s", name, country, skill);
	}
	

}

class PlayerBO{
	void displayAllPlayerDetails(ArrayList<Object> playerList)
	{
		for(Object obj:playerList)
		{
			System.out.println(obj);
			
		}
	}
}

public class PlayerDetails{
	static Scanner scanner=new Scanner(System.in);
	public static void main(String args[])
	{
		
		System.out.println("Enter the number of players");
		int numberOfPlayers=Integer.parseInt(scanner.nextLine());
		ArrayList<Object> playerList=new ArrayList<Object>();
		for(int i=0;i<numberOfPlayers;i++)
		{
			playerList.add(getDetails());

		}
//		System.out.println(playerList);
		PlayerBO playerBO=new PlayerBO();
		playerBO.displayAllPlayerDetails(playerList);
	}
	
	static Object getDetails()
	{String name,country,skill;
	
	System.out.println("Enter the player name ");
	
	name=scanner.nextLine();
	
	System.out.println("Enter the country ");
	country=scanner.nextLine();
	
	System.out.println("Enter the skill ");
	skill=scanner.nextLine();

		Player obj=new Player(name,country,skill);
		return obj;
	}
}


