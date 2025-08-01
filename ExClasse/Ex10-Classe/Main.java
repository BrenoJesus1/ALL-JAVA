import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.5, 1000);

    int opcao;
    do {
      System.out.println("Menu:");
      System.out.println("1. Abastecer por valor");
      System.out.println("2. Abastecer por litro");
      System.out.println("3. Alterar valor do litro");
      System.out.println("4. Alterar tipo de combustível");
      System.out.println("5. Alterar quantidade de combustível");
      System.out.println("6. Sair");
      System.out.print("Opção: ");
      opcao = in.nextInt();

      if (opcao == 1) {
        System.out.print("Digite o valor a ser abastecido: ");
        double valor = in.nextDouble();
        bomba.abastecerPorValor(valor);
      } else if (opcao == 2) {
        System.out.print("Digite a quantidade em litros de combustível: ");
        double litros = in.nextDouble();
        bomba.abastecerPorLitro(litros);
      } else if (opcao == 3) {
        System.out.print("Digite o novo valor do litro: ");
        double novoValor = in.nextDouble();
        bomba.alterarValor(novoValor);
      } else if (opcao == 4) {
        System.out.print("Digite o novo tipo de combustível: ");
        String novoCombustivel = in.next();
        bomba.alterarCombustivel(novoCombustivel);
      } else if (opcao == 5) {
        System.out.print("Digite a nova quantidade de combustível: ");
        double novaQuantidade = in.nextDouble();
        bomba.alterarQuantidadeCombustivel(novaQuantidade);
      } else if (opcao == 6) {
        System.out.println("Você saiu do menu.");
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }

      in.close();

      System.out.println();
    } while (opcao != 6);
  }
}