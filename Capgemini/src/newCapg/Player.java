package newCapg;

public class Player {

	String name;
	String country;
	String skill;
	
	void setName(String name)
	{
		this.name=name;
	}
	void setCountry(String country)
	{
		this.country=country;
	}
	void setSkill(String skill)
	{
		this.skill=skill;
	}
	void getDetails()
	{
		System.out.println("Player Details:\nPlayer Name: "+name+"\nCountry Name: "+country+"\nSkill: "+skill);
	}
}
