import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("raio");
    float r = in.nextFloat();

    System.out.print("Circunferencia:");
    System.out.print(r * r * 3.1415);
  }
}