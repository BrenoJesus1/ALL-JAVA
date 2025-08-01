package Strategy;
import java.util.List;

public class OrdenacaoBubbleSort implements EstrategiaOrdenacao {

    public void ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {                    
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                }
            }
        }

        System.out.println("Lista ordenada usando Bubble Sort: " + numeros);
        
    }
}