package H12;

public class Quiz3_b extends Quiz3
{
  int x = 3;
  String methodeA(String s, int i)
  {
    String str = s + ", " + i;
    super.x ++; //Hij geeft hier een fout weer omdat hij 1 wilt optellen bij 'x', maar dit is niet mgelijk want x is een final en kan niet worden aangepast.
    return str;
  }
  public static void main(String[] args)
  {
    Quiz3_b mk = new Quiz3_b();
    System.out.print(mk.methodeA(23, "Emma"));
  }
}
