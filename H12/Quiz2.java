package H12;

public class Quiz2 extends Quiz2_b
{
  int z = 5;
  int methodeB(int x)
  {
	  System.out.print("x");
	  return x;
  }
  
  //De naam methodeB is niet toegestaan word de final van de superklasse overschreven, en dit kan niet.
  
  void mijnKlasse(int x)
  {
    System.out.print("x");
  }
}