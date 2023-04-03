package ex;

public class CharBoolDemo {
  public static void main(String[] args) {
    char a = 'a';
    char A = 'A';
    char one = '1';
    char two = '2';
    String three = "3";

    boolean cham = true;
    boolean geojit = false;

    System.out.println("a = " + a + "," + (int)a + "," + ++a);
    System.out.println("A = " + A + "," + (int)A + "," + ++A);
    System.out.println("one = " + one + "," + (int)one);
    System.out.println("cham = " + cham);

    System.out.println("one++ = " + ++one);

  }
}
