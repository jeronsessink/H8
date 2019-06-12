package Opdrachtenhfdstk8en9.H9quizes;
import java.util.ArrayList;

public class Quiz7 
{
	public static void main(String[] args) {
		ArrayList<String> landen = new ArrayList<String>();
		landen.add("Duitsland");
		landen.add("Verenigde Staten");
		landen.add("Rusland");
		landen.add("Verenigd Koninkrijk");
		landen.add(2, "India");
		
		
		//Duitsland verwijderen.
		landen.remove(0);

		//Als de arraylist leeg was, zou hij niks printen.
		for (int i = 0; i < landen.size(); i++)
		{
			System.out.println(" " + landen.get(i));

		}
		System.out.print("Rusland's index nr. is: ");
		System.out.println(landen.indexOf("Rusland"));
		System.out.println("De hoeveelheid landen in de Arraylist: ");
		System.out.println(landen.size());

		if (landen.contains("Spanje")) {
			System.out.println("Spanje was found in the list.");
		} else
			System.out.println("Spanje was not found in the list.");

		if (landen.contains("India")) {
			System.out.println("India staat op de lijst.");
		} else
			System.out.println("India staat niet op de lijst.");
	}
}