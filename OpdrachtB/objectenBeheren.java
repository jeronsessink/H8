package OpdrachtB;
import java.util.ArrayList;
import java.util.Scanner; 
import javax.swing.*;

public class objectenBeheren {
	public static void main(String[] args) {
		//JFrame frame = new JFrame("My First GUI");
	       //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      // frame.setSize(300,300);
	      // frame.setVisible(true);
		
		//Zoals u hierboven kunt zien heb ik geprobeerd als verdieping GUI toe te voegen, maar helaas ging dit niet goed.
		//Ik liep constant tegen errors aan, maar de rest is wel gelukt.
		
		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		
	
		ArrayList<String> auto = new ArrayList<String>();
		auto.add("Porsche");
		auto.add("Ferrari");
		auto.add("Lamborghini");
		
		//hooi
		 
		
		while (true) {
		System.out.println("Welke auto wil je toevoegen?");
		auto.add(keyboardInput.next());
		
		auto.forEach((n) -> System.out.println(n));
		}
		
	}
}
