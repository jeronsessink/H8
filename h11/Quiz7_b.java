package h11;

public class Quiz7_b extends Quiz7 
{
	Quiz7_b(String naam)
	{
		super(naam);
		System.out.print(naam);
	}
	public static void main (String[] args)
	{
		Quiz7_b sk = new Quiz7_b("s");
		//Als ik hem in "s" verander, veranderd de uitvoer van "xdxx" naar "sdss".
	}

}
