package H10;

public class Quiz1 {
	int nr;
	static int stNr;

	public Quiz1() {
		nr++;
		stNr++;
	}

	public static void main(String[] args) {
		Quiz1 wn1 = new Quiz1();
		Quiz1 wn2 = new Quiz1();
		Quiz1 wn3 = new Quiz1();
		Quiz1 wn4 = new Quiz1();
		Quiz1 wn5 = new Quiz1();
		//De twee aangemaakte objecten.
		System.out.print(Quiz1.stNr + ", ");
		System.out.print(wn1.nr + ", ");
		System.out.print(wn2.nr + ", ");
		System.out.print(wn3.nr);
	}
//De twee nieuwe objecten hebben invloed op de uitkomst, want nu print hij '5, 1, 1, 1' naar standaarduitvoer. Zonder dit word dat '3, 1, 1, 1'.
}

