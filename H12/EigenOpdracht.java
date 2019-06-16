package H12;

public final class EigenOpdracht {
  final int x = 3;
  int bereken(int y, int z)
  {
    if (y >= z)
    {
      return y + x;
    }
    else
    {
      int x = 6; /* 4 */
      return z + x;
    }
  }
  
  public static void main(String[] args)
  {
	  EigenOpdracht mk = new EigenOpdracht();
    System.out.println(mk.bereken(4, 6));
  }
}
