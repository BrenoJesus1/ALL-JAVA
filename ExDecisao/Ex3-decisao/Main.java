import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String sexo;

    System.out.println("Digite o seu sexo utilizando apenas as letras F para feminino ou M para masculino");
    sexo = in.nextLine();

    in.close();

    if (sexo.equalsIgnoreCase("M")) {
      System.out.println("O sexo é masculino");
    }

    else if (sexo.equalsIgnoreCase("F")) {
      System.out.println("O sexo é feminino");
    }

    else {
      System.out.println("Sexo inválido");
    }

  }
}