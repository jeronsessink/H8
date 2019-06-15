package h11;

public class Quiz6_b extends Quiz6
{
	//Opdracht 1. De standaarduitvoer veranderd van 'dd810' naar 'pd810'.
	protected char e = 'p';
	
	void mijnMethode1()
	{
		x ++;
		System.out.print(e);
		super.mijnMethode1();
		x += 2;
		System.out.print(x);
	}
	public static void main(String[] args)
	{
		Quiz6_b sk = new Quiz6_b();
		sk.mijnMethode1();
	}
}
