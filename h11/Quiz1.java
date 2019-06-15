package h11;

public class Quiz1 extends Quiz1_b{
	private int y = 8;
	
	Quiz1() {
		x += 5;
		y ++;
		System.out.println(x + ", " + y);
	}
	public static void main(String[] args) {
		Quiz1 qz = new Quiz1();
	}
}

//Als de waarde van x gelijk is aan 5 en de waarde van y aan 8, word er '10, 9' geprint naar standaarduitvoer.