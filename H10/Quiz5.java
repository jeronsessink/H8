package H10;

public class Quiz5
{
	 int x;
	 StringBuffer sb = new StringBuffer();
	
	public Quiz5()
	{
		mijnMethode();
	}
	public void mijnMethode()
	{
	    x += 3;
	    sb.append(x);
	}
	  public static void main(String[] args)
	  {
	    Quiz5 mk = new Quiz5();
	    Quiz5 mk2 = new Quiz5();
	    Quiz5 mk3 = new Quiz5();
	    System.out.println(mk.sb);
	  }
}

/*1. Als je static weghaald bij klassenvariabel X dan word de uitvoer veranderd van '369' naar '333'.
 *2.  Ik denk wel dat het invloed heeft op het resultaat.
 *3. Nu print hij alleen '3' naar standaarduitvoer.
 * 
 * */ 
 