package Opdrachtenhfdstk8en9.H9quizes;

public class Quiz6 {
	void myMethod() {
		String strArray[] = { "n", "b", "a", "z" };
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("z")) {
				System.out.print("x1 ");
			} else if (strArray[i].equals("a")) {
				System.out.print("x2 ");
			} else if (strArray[i].equals("b")) {
//Bij het aanpassen van 'B' naar 'b' veranderd er niks.
				System.out.print("x2 ");
			} else {
				System.out.print("x3 ");
			}
		}
	}

	public static void main(String[] args) {
		Quiz6 mk = new Quiz6();
		mk.myMethod();
	}
}
