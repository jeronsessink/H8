package Opdrachtenhfdstk8en9.H9quizes;
import java.util.ArrayList;

public class Quiz8
{
  ArrayList<Quiz8student> Quiz8Lijst = new ArrayList<Quiz8student>();
  public void Quiz9Toevoegen()
  {
	  Quiz8student st1 = new Quiz8student("Lars", 24, "lars@itmail.com");
	  Quiz8student st2 = new Quiz8student("Isa ", 22, "isa@dzork.com");
	  Quiz8student st3 = new Quiz8student("Thomas", 33, "thomas@ysmail.com");
	  Quiz8student st4 = new Quiz8student("Susan", 25, "susan@rzmail.com");
	  Quiz8student st5 = new Quiz8student("Rita", 28, "rita@online.com");
	  Quiz8Lijst.add(st1);
	  Quiz8Lijst.add(st2);
	  Quiz8Lijst.add(st3);
	  Quiz8Lijst.add(st4);
	  Quiz8Lijst.add(st5);
  }
  public static void main(String[] args)
  {
    Quiz8 cl = new Quiz8();
    cl.Quiz9Toevoegen(); //Als je dit statement weghaald word er niks meer geprint.
    for (int i = 0; i < cl.Quiz8Lijst.size(); i++)
    {
      //if (i == 2) //Als je deze weglaat, print hij de hele array, anders alleen Thomas.
      {
        System.out.println(cl.Quiz8Lijst.get(i).naam + ", "
            + cl.Quiz8Lijst.get(i).leeftijd + ", "
            + cl.Quiz8Lijst.get(i).email);
      }
    }
  }
}