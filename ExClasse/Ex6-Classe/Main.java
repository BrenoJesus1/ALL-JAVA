import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Tv televisor = new Tv(1, 10);

    System.out.println("Canal: " + televisor.canal);
    System.out.println("Volume: " + televisor.volume);

    televisor.aumentarVolume();
    System.out.println("Volume: " + televisor.volume);

    televisor.diminuirVolume();
    System.out.println("Volume: " + televisor.volume);

  }
}