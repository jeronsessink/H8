package Hoofdstuk6;

public class Edelmetaal {
	double ozGoudPrijs = 1300.0;
	double ozZilverPrijs = 20.0;
	double ozPlatinumPrijs = 936.0;
	boolean isGoud = true;
	
	public double berekenMetaalPrijs(boolean isGoud, double ounce)
	{
		if(isGoud)
		{
			return ozGoudPrijs * ounce;
		}
		else {
			return ozPlatinumPrijs * ounce;
		}
	}
	public static void main(String[] args)
	{
		Edelmetaal em = new Edelmetaal();
		System.out.print(em.berekenMetaalPrijs(false,6.0));
		System.out.print(", ");
		System.out.print(em.berekenMetaalPrijs(true,2));
	}
}
