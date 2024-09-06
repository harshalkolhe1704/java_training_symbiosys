package hasAinheritance;

public class uniDirectHasA 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FootBall football = new FootBall("Association football" , "68-70 cm" , "420 gm");
		FootballPlayer fbp = new FootballPlayer("Harshal", football);
		System.out.println("Player " + fbp.getName() + " plays with " + fbp.getFootball().getType());

	}

}
