package H12;

public class Quiz4_b extends Quiz4 
{
	void methodeA(int x, int y)
	{
		int z = x - y;
		System.out.print(z);
	}
	public static void main(String[] args)
	{
		Quiz4_b mk = new Quiz4_b();
		mk.methodeA(6, 4); //Als je dit statement zijn waarden aanpast van "5,3.0" naar "6, 4" dan word de uitkomst "2" inplaats van "15.0".
	}
}