package Hoofdstuk6;

public class Quiz2 {
	int i = 5;
	int i2 = 3;
	int i3 = 12;
	int i4 = 41;
	
	
	public int bereken()
	{
		i ++;
		if(i <= i2)
		{
			return i * i2;
		}
		else if((i * i2) >= 9)
		{
			return i + i2 + 5;
		}
		return i + i2 + 3;
	}
	
	public int bereken2() {
		return i3 * i4;
	}
	
	public static void main(String[] args)
	{
		Quiz2 mk = new Quiz2();
		Quiz2 mk2 = new Quiz2();
		System.out.print(mk.bereken());
		System.out.print(", ");
		System.out.print(mk2.bereken2());
	}
}
