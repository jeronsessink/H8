package h11;

import h11.Quiz8;

public class Quiz8_b extends Quiz8 
{
	public static void main (String[] args)
	{
		Quiz8 supK = new Quiz8();
		Quiz8_b subK = new Quiz8_b();
		System.out.print(supK.str1); /* 1 */
		//System.out.print(supK.str2); /* 2 */
		//System.out.print(supK.str3); /* 3 */
		//System.out.print(supK.str4); /* 4 */
		System.out.print(supK.str2); /* 5 */
		
		//Opdracht 3, deze statements bevestigen het.
		System.out.print(supK.mijnInt); /* 5 */
		System.out.print(subK.mijnInt); /* 5 */
	}

}
