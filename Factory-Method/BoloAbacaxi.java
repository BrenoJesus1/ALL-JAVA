package Factory;

public class BoloAbacaxi implements Bolo {
    @Override
    public void preparar(String ingrediente) {
        
        System.out.println("O bolo de abacaxi feito com " + ingrediente + " foi preparado." );
    }
}