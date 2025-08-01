import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Salário do Colaborador: ");
    double salario = in.nextDouble();

    in.close();

    double salarioNovo, percentual1, percentual2, percentual3, percentual4, aumento1, aumento2, aumento3, aumento4;

    percentual1 = 0.2;
    percentual2 = 0.15;
    percentual3 = 0.1;
    percentual4 = 0.05;

    aumento1 = salario * percentual1;
    aumento2 = salario * percentual2;
    aumento3 = salario * percentual3;
    aumento4 = salario * percentual4;

    if (salario <= 280) {
      salarioNovo = salario + aumento1;

      System.out.println("Salário antes do reajuste: " + salario + "\nPercentual para reajuste: " + percentual1
          + "\nValor do aumento: " + aumento1 + "\nNovo salário: " + salarioNovo);
    }

    else if (salario > 280 && salario <= 700) {
      salarioNovo = salario + aumento2;

      System.out.println("Salário antes do reajuste: " + salario + "\nPercentual para reajuste: " + percentual2
          + "\nValor do aumento: " + aumento2 + "\nNovo salário: " + salarioNovo);
    }

    else if (salario > 700 && salario <= 1500) {
      salarioNovo = salario + aumento3;

      System.out.println("Salário antes do reajuste: " + salario + "\nPercentual para reajuste: " + percentual3
          + "\nValor do aumento: " + aumento3 + "\nNovo salário: " + salarioNovo);
    }

    else {
      salarioNovo = salario + aumento4;

      System.out.println("Salário antes do reajuste: " + salario + "\nPercentual para reajuste: " + percentual4
          + "\nValor do aumento: " + aumento4 + "\nNovo salário: " + salarioNovo);
    }

  }
}