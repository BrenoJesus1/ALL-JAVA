import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("altura");
    float h = in.nextFloat();

    System.out.println("peso ideal:");
    System.out.println((72.7 * h) - 58);
  }
}