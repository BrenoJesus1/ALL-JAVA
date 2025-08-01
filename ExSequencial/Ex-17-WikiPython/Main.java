import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
  
     System.out.println("Informe o tamanho da área em m² a ser pintado: "); 
    double metros = in.nextDouble();
    

    in.close();

    
    
   
    double litrosTinta = metros / 6;
    
    double latasQuantidade = Math.ceil(litrosTinta / 18);
   
    double valorLatas = Math.ceil(latasQuantidade * 80);
   
    double galaoQuantidade = Math.ceil(litrosTinta / 3.6);
  
    double valorGalao = Math.ceil(galaoQuantidade * 25);

      
    if (litrosTinta < 18) {
    galaoQuantidade = Math.ceil(litrosTinta / 3.6);
      valorGalao = Math.ceil(galaoQuantidade * 25);
      
      System.out.println("Voce irá precisar de " + litrosTinta + " litros de tinta e deverá comprar apenas " + galaoQuantidade + " galão(ões).");
    }  
      
   /
    else if ((litrosTinta % latasQuantidade) == 0) {
      System.out.println("Voce irá precisar de " + litrosTinta + " litros de tinta e deverá comprar apenas " + latasQuantidade + " lata(s).");
    }  

    else {
      
  
    double litrosTintaFolga = litrosTinta*1.1;
    double novaQuantidadeLatas = Math.floor(litrosTintaFolga / 18);
    double litrosTintaFolgaFaltando = litrosTintaFolga - (novaQuantidadeLatas * 18);
    double novaQuantidadeGalao = Math.ceil((litrosTintaFolgaFaltando / 3.6));
      double custoMisturado = (novaQuantidadeLatas * 80) + (novaQuantidadeGalao * 25);
      
      System.out.println("Voce precisará de um MIX \nValor a ser gasto = " + custoMisturado);
      System.out.println("Lata(S) = " + novaQuantidadeLatas +"\nGalão(ões) = " + novaQuantidadeGalao);
    }

  }
}