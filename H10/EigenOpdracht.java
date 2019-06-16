package H10;

public class EigenOpdracht {
	int nr;
	static int stNr;

	public EigenOpdracht() {
		nr++;
		stNr++;
	}

	public static void main(String[] args) {
		EigenOpdracht wn1 = new EigenOpdracht();
		EigenOpdracht wn2 = new EigenOpdracht();
		//Twee objecten
		System.out.print(EigenOpdracht.stNr + ", ");
		System.out.print(wn1.nr + ", ");
		System.out.print(wn2.nr);
	}

}

