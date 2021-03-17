package newCapg;

public class Team {

	private String name;
	private String coach;
	private String location;
	private String players;
	private String captain;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCoach(String coach)
	{
		this.coach=coach;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setPlayers(String players)
	{
		this.players=players;
	}
	public void setCaptain(String captain)
	{
		this.captain=captain;
	}
	public String getName()
	{
		return this.name;
	}
	public String getCoach()
	{
		return this.coach;
	}
	public String getLocation()
	{
		return this.location;
	}
	public String getPlayers()
	{
		return this.players;
	}
	public String getCaptain()
	{
		return this.captain;
	}

	public void displayTeamDetails()
	{
		System.out.println("Team Details");
		System.out.println("Team: "+this.name);
		System.out.println("Coach: "+this.coach);
		System.out.println("Location: "+this.location);
		System.out.println("Players: "+this.players);
		System.out.println("Captain: "+this.captain);
		
	}
}
