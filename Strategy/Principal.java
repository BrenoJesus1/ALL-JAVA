package Strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(13);
        numeros.add(17);
        numeros.add(2);
        numeros.add(4);
        numeros.add(9);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha o método de ordenação: ");
        System.out.println("1- Bubble Sort");
        System.out.println("2- Selection Sort");
        System.out.println("3- Insertion Sort");
        int escolha = in.nextInt();
        
        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Método inválido");
                return;
        }
        
        contexto.executarOrdenacao(numeros);
        in.close();
    }
}