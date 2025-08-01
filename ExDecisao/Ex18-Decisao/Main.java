import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Digite uma data no formato dd/mm/aaaa: ");
    String data = in.nextLine();

    in.close();

    if (verificarFormatoValido(data)) {
      if (verificarDataValida(data)) {
        System.out.println("Data válida.");
      } else {
        System.out.println("Data inválida.");
      }
    } else {
      System.out.println("Formato inválido.");
    }
  }

  public static boolean verificarFormatoValido(String data) {
    String formato = "\\d{2}/\\d{2}/\\d{4}";

    return data.matches(formato);
  }

  public static boolean verificarDataValida(String data) {
    String[] partes = data.split("/");
    int dia = Integer.parseInt(partes[0]);
    int mes = Integer.parseInt(partes[1]);
    int ano = Integer.parseInt(partes[2]);

    if (ano < 0) {
      return false;
    }

    if (mes < 1 || mes > 12) {
      return false;
    }

    if (mes == 2) {
      if (dia < 1 || dia > 29) {
        return false;
      }
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      if (dia < 1 || dia > 30) {
        return false;
      }
    } else {
      if (dia < 1 || dia > 31) {
        return false;
      }
    }

    return true;
  }
}