import java.util.Scanner;
class Main {
    public static void main(String[]args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("nota 1:");
      float n1 = in.nextFloat();
      
      System.out.println("nota 2:");
      float n2 = in.nextFloat();
      
      System.out.println("nota 3:");
      float n3 = in.nextFloat();
      
      System.out.println("nota 4:");
      float n4 = in.nextFloat();
      
      System.out.println("a média é:");
      System.out.print((n1 + n2 + n3 + n4) / 4 );
    }
  }
    