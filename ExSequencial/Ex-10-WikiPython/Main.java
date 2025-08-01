import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Celsius");
    float c = in.nextFloat();

    System.out.println("Farenheit");
    System.out.println((c * 1.8) + 32);
  }
}