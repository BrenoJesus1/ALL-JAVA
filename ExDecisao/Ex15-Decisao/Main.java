import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite o valor do lado 1 do triangulo: ");
    float lado1 = in.nextFloat();

    System.out.println("Digite o valor do lado 2 do triangulo: ");
    float lado2 = in.nextFloat();

    System.out.println("Digite o valor do lado 3 do triangulo: ");
    float lado3 = in.nextFloat();

    in.close();

    float menor, medio, maior, soma;

    if (lado1 >= lado2 && lado1 >= lado3) {
      maior = lado1;
      if (lado2 >= lado3) {
        medio = lado2;
        menor = lado3;
      } else {
        medio = lado3;
        menor = lado2;
      }
    }

    if (lado2 >= lado1 && lado2 >= lado3) {
      maior = lado2;
      if (lado1 >= lado3) {
        medio = lado1;
        menor = lado3;
      } else {
        medio = lado3;
        menor = lado1;
      }
    }

    else {
      maior = lado3;
      if (lado1 >= lado2) {
        medio = lado1;
        menor = lado2;
      } else {
        medio = lado2;
        menor = lado3;
      }
    }

    soma = menor + medio;

    if (soma >= maior) {
      System.out.println("O triangulo é valido.");
    }

    else {
      System.out.println("O triangulo é invalido.");
      return;
    }

    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("O triângulo é equilátero.");
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      System.out.println("O triângulo é isósceles.");
    } else {
      System.out.println("O triângulo é escaleno.");
    }

  }
}
