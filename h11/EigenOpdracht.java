package h11;

public class EigenOpdracht extends EigenOpdracht_b
{
	private int y = 8;
	
	EigenOpdracht() {
		x += 5;
		y ++;
		System.out.println(x + ", " + y);
	}
	public static void main(String[] args) {
		EigenOpdracht qz = new EigenOpdracht();
	}
}
