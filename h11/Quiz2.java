package h11;

public class Quiz2 extends Quiz2_b {
	Quiz2(int y) {
		x += y;
	}
	
	public static void main(String[] args) {
		Quiz2 qz = new Quiz2(4);
		Quiz2 qz2 = new Quiz2(6);
		//qz.2 is het nieuwe object van de Subklasse met de waarde van 6.
		System.out.print(qz.x);
		System.out.print(qz2.x);
	}
}

//De waarde van X van het qz2 object is 3, + 6 is dus 9.