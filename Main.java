import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type in a length: ");
    double rec1Len = sc.nextDouble();
    System.out.println("Type in a width: ");
    double rec1Wid = sc.nextDouble();
    System.out.println("Type in a length: ");
    double rec2Len = sc.nextDouble();
    System.out.println("Type in a width: ");
    double rec2Wid = sc.nextDouble();

    Rectangle rec1 = new Rectangle(rec1Len, rec1Wid);
    Rectangle rec2 = new Rectangle(rec2Len, rec2Wid);

    boolean isRotated = false;

    if ( (rec1.getLength() == rec2.getWidth()) || (rec2.getLength() == rec1.getWidth()) )
    {
      isRotated = true;
    }
    System.out.println(isRotated);

    boolean isCongruent = false;

    if (rec1.equals(rec2) || isRotated)
    {
      isCongruent = true;
    }

    System.out.println(isCongruent);

    boolean isSimilar = false;

    if ( (rec1.getWidth()/rec2.getWidth()) == (rec1.getLength()/rec2.getLength()) || isCongruent)
    {
      isSimilar = true;
    }
    System.out.println(isSimilar);

  }
}
