package h11;

public class Quiz5_b extends Quiz5
{
	int mijnMethode(int i, int i2)
	{
		return mijnMethode(i) + x + i2;
	}
	public static void main(String[] args)
	{
		Quiz5_b subK = new Quiz5_b();
		System.out.print(subK.mijnMethode(2,8));
		//Als je het van het bovenstaand statement de waarde vervangt van 3,6 naar 2,8, dan word er '14' geprint inplaats van '13'.
	}
}

