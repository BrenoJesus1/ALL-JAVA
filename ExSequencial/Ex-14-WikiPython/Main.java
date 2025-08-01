import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("peso de peixes");
    float p = in.nextFloat();

    if (p >= 50) {
      System.out.println("excesso");
      System.out.println(p - 50);
      System.out.println("multa");
      System.out.println((p - 50) * 4);
    } else {
      System.out.println("não há excesso");
    }
  }
}