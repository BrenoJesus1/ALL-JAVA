import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Metros:");
    float c = in.nextFloat();

    System.out.println("Centimetros:");
    System.out.println(c * 100);
  }
}