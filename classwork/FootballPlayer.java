package hasAinheritance;

public class FootballPlayer 
{
	private String name;
	private FootBall football;
	
	public FootballPlayer(String name,FootBall football)
	{
		this.name = name;
		this.football = football;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public FootBall getFootball() 
	{
		return football;
	}
	public void setFootball(FootBall football) 
	{
		this.football = football;
	}
	

}
