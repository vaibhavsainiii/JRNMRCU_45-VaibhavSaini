package newCapg;

public class Venue {
	
	String name;
	String city;
	
	
	void setName(String name)
	{
		this.name=name;
	}
	void setCity(String city)
	{
		this.city=city;
	}
	
	void getDetails()
	{
		System.out.println("Venue details::\nVenue name: "+name+"\nCity Name: "+city);
	}
}
