package h11;

public class Quiz3 extends Quiz3_b {
	char c2= 'A';
	
	Quiz3() {
		this('N');
		System.out.print(c2);
	}
	
	Quiz3(char c) {
		System.out.print(c);
	}
	
	void mijnMethode() {
		super.mijnMethode();
		System.out.print(c2);
	}
	
	public static void main(String[] args) {
		Quiz3 subK = new Quiz3();
		subK.mijnMethode();
	}
}