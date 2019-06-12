package Opdrachtenhfdstk8en9.H9quizes;
import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		String[] arrDier = new String[9];
		arrDier[0] = "Wolf ";
		arrDier[1] = "Leeuw ";
		arrDier[2] = "Luipaard ";
		arrDier[3] = "Olifant ";
		arrDier[4] = "Tijger ";
		arrDier[5] = "Zebra ";
		arrDier[6] = "Beer ";
		arrDier[7] = "Aap ";
		arrDier[8] = "Beer ";
		
		Arrays.sort(arrDier);

		for (int i = 0; i < arrDier.length; i++) {
			if (i > 1) 
			{
				System.out.println(arrDier[i]);
			}
		}
		
	}
}