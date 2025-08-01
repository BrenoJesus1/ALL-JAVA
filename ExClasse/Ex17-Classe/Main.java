import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Fazenda fazenda = new Fazenda();

    fazenda.adicionarBichinho(new BichoVirtual("Bichinho1", 2));
    fazenda.adicionarBichinho(new BichoVirtual("Bichinho2", 3));
    fazenda.adicionarBichinho(new BichoVirtual("Bichinho3", 1));

    int opcao;

    do {
      System.out.println("Menu:");
      System.out.println("1. Alimentar todos os bichinhos");
      System.out.println("2. Brincar com todos os bichinhos");
      System.out.println("3. Ouvir todos os bichinhos");
      System.out.println("4. Sair");
      System.out.print("Opção: ");
      opcao = in.nextInt();

      if (opcao == 1) {
        System.out.print("Digite a quantidade de comida a ser fornecida: ");
        int quantidadeComida = in.nextInt();
        fazenda.alimentarBichinhos(quantidadeComida);
      } else if (opcao == 2) {
        System.out.print("Digite o tempo de brincadeira: ");
        int tempoBrincadeira = in.nextInt();
        fazenda.brincarComBichinhos(tempoBrincadeira);
      } else if (opcao == 3) {
        fazenda.ouvirBichinhos();
      } else if (opcao == 4) {
        System.out.println("Você saiu do programa.");
      } else if (opcao == 5) {
        System.out.println(fazenda.str());
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }

      in.close();

      System.out.println();
    } while (opcao != 4);
  }
}