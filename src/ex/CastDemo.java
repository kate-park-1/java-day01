package ex;

public class CastDemo {
  public static void main(String[] args) {
    int i;
    double d;
    byte b;

    i = 7/4;   // 1.~~ => 1
    System.out.println("i = " + i);

    d = 7/4;  // 1
    System.out.println("d = " + d);  // 7/4 = (double)1==> 1.0

    d = 7 / (double)4;  // (자동 double)7 / 4.0 = 7.0 / 4.0 = 1.75
    System.out.println("d = " + d);

    i = 100;
    b = 100; // 자동형변환
    b = (byte)i; // 강제형변환
  }
}
