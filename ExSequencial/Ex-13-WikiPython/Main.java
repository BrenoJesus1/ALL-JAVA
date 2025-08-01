import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("altura");
    float h = in.nextFloat();

    System.out.println("Peso ideal masculino");
    System.out.println((72.7 * h) - 58);
    System.out.println("Peso ideal feminino");
    System.out.println((62.1 * h) - 44.7);
  }
}