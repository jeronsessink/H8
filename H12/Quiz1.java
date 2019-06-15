package H12;

public final class Quiz1
{
  final int x = 3;
  int bereken(int y, int z)
  {
    if (y >= z)
    {
      return y + x;
    }
    else
    {
      // y = 5; /* 1 */
      // z += 3; /* 2 */
      // z = x / 2; /* 3 */
      // int x = 6; /* 4 */
      // x ++ ; /* 5 */
      return z + x;
    }
  }
  
  public static void main(String[] args)
  {
    Quiz1 mk = new Quiz1();
    System.out.println(mk.bereken(4, 6));
  }
}
//Het is niet mogelijk voor 'MijnKlasse' om een subklasse te hebben omdat het een 'final class' is. Het kan wél een superklasse hebben, dit komt doordat
// het 'MijnKlasse' overruled.