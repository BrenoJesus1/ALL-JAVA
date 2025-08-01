import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Salário por hora");
    double salario = in.nextDouble();
    
    System.out.println("Horas trabalhadas por mês");
    double horas = in.nextDouble();
    
    double bruto = salario * horas;
    double ir = bruto * 0.11;
    double inss = bruto * 0.08;
    double sindicato = bruto * 0.05;
    double liquido = bruto - ir - inss - sindicato;
    
    System.out.println("Salário bruto: " + bruto + "\n oi");
    System.out.println("Desconto do IR: " + ir);
    System.out.println("Desconto do INSS: " + inss);
    System.out.println("Desconto do Sindicato: " + sindicato);
    System.out.println("Salário liquido: " + liquido);
  }
}