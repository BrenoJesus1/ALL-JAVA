import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Farenheit");
    float c = in.nextFloat();

    System.out.println("celsius");
    System.out.println(5 * ((c - 32) / 9));
  }
}