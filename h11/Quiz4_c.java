package h11;

public class Quiz4_c extends Quiz4_b{
	public Quiz4_c()
	{
		x += 2;
		y += 3;
		System.out.print(" x" + x);
		System.out.print(" y" + y);
	}
	public static void main(String[] args)
	{
		Quiz4_c subK = new Quiz4_c();
	}
}

// De uitvoer is x5 y8 x 12 y 11 als je een variable x = 10 geeft.