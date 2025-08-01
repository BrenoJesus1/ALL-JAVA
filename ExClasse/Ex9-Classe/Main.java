import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Ponto pontoInicial = new Ponto(1, 1);
    Retangulo r1 = new Retangulo(pontoInicial, 5, 3);

    int opcao;

    do {
      System.out.println("Menu:");
      System.out.println("1. Alterar valores do retângulo");
      System.out.println("2. Imprimir centro do retângulo");
      System.out.println("3. Sair");
      System.out.print("Opção: ");
      opcao = in.nextInt();

      if (opcao == 1) {
        System.out.print("Digite as coordenadas do ponto inicial.\nCoordenada X: ");
        int x = in.nextInt();
        System.out.print("Coordenada Y: ");
        int y = in.nextInt();
        pontoInicial = new Ponto(x, y);

        System.out.print("Digite a largura do retângulo: ");
        int largura = in.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        int altura = in.nextInt();

        in.close();

        r1 = new Retangulo(pontoInicial, largura, altura);
      } else if (opcao == 2) {
        Ponto centro = r1.encontrarCentro();
        centro.imprimirPonto();
      } else if (opcao == 3) {
        System.out.println("Voce saiu do menu");
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }

      System.out.println();
    } while (opcao != 3);

  }
}