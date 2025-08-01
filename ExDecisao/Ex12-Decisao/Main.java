import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Valor por hora: ");
    double valorHora = in.nextDouble();

    System.out.println("Horas totais trabalhadas: ");
    double horasTotais = in.nextDouble();

    in.close();

    double salarioBruto, descontoIR1, descontoIR2, descontoIR3, sindicato, FGTS, totalDescontos0, totalDescontos1,
        totalDescontos2, totalDescontos3, salarioLiquido0, salarioLiquido1, salarioLiquido2, salarioLiquido3;

    salarioBruto = valorHora * horasTotais;

    descontoIR1 = salarioBruto * 0.05;
    descontoIR2 = salarioBruto * 0.1;
    descontoIR3 = salarioBruto * 0.2;

    sindicato = salarioBruto * 0.03;
    FGTS = salarioBruto * 0.11;

    totalDescontos0 = sindicato;
    totalDescontos1 = descontoIR1 + sindicato;
    totalDescontos2 = descontoIR2 + sindicato;
    totalDescontos3 = descontoIR3 + sindicato;

    salarioLiquido0 = salarioBruto - totalDescontos0;
    salarioLiquido1 = salarioBruto - totalDescontos1;
    salarioLiquido2 = salarioBruto - totalDescontos2;
    salarioLiquido3 = salarioBruto - totalDescontos3;

    if (salarioBruto <= 900) {

      System.out.println("Salário bruto: " + valorHora + " (*) " + horasTotais + " (=) " + salarioBruto + "\nIR: Isento"
          + "\nSindicato: " + sindicato + "\nFGTS: " + FGTS + "\nTotal de descontos: " + totalDescontos0
          + "\nSalário Líquido: " + salarioLiquido0);
    }

    else if (salarioBruto > 900 && salarioBruto <= 1500) {

      System.out.println("Salário bruto: " + valorHora + " (*) " + horasTotais + " (=) " + salarioBruto + "\nIR: "
          + descontoIR1 + "\nSindicato: " + sindicato + "\nFGTS: " + FGTS + "\nTotal de descontos: " + totalDescontos1
          + "\nSalário Líquido: " + salarioLiquido1);
    }

    else if (salarioBruto > 1500 && salarioBruto <= 2500) {

      System.out.println("Salário bruto: " + valorHora + " (*) " + horasTotais + " (=) " + salarioBruto + "\nIR: "
          + descontoIR2 + "\nSindicato: " + sindicato + "\nFGTS: " + FGTS + "\nTotal de descontos: " + totalDescontos2
          + "\nSalário Líquido: " + salarioLiquido2);
    }

    else if (salarioBruto > 2500) {

      System.out.println("Salário bruto: " + valorHora + " (*) " + horasTotais + " (=) " + salarioBruto + "\nIR: "
          + descontoIR3 + "\nSindicato: " + sindicato + "\nFGTS: " + FGTS + "\nTotal de descontos: " + totalDescontos3
          + "\nSalário Líquido: " + salarioLiquido3);
    }
  }
}