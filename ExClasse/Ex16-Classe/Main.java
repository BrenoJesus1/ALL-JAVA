import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    BichoVirtual bicho = new BichoVirtual();

    System.out.print("Digite o nome do bichinho: ");
    String nome = in.nextLine();
    bicho.alterarNome(nome);

    System.out.print("Digite a idade do bichinho: ");
    int idade = in.nextInt();
    bicho.alterarIdade(idade);

    int opcao;

    do {
      System.out.println("Menu:");
      System.out.println("1. Fornecer comida");
      System.out.println("2. Brincar");
      System.out.println("3. Exibir humor");
      System.out.println("4. Sair");
      System.out.print("Opção: ");
      opcao = in.nextInt();

      if (opcao == 1) {
        System.out.print("Digite a quantidade de comida a ser fornecida: ");
        int quantidadeComida = in.nextInt();
        bicho.fornecerComida(quantidadeComida);
      } else if (opcao == 2) {
        System.out.print("Digite o tempo de brincadeira: ");
        int tempoBrincadeira = in.nextInt();
        bicho.brincar(tempoBrincadeira);
      } else if (opcao == 3) {
        System.out.println("Humor: " + bicho.humor());
      } else if (opcao == 4) {
        System.out.println("Você saiu do programa.");
      } else if (opcao == 5) {
        System.out.println(bicho.str());
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }

      in.close();

      System.out.println();
    } while (opcao != 4);
  }
}