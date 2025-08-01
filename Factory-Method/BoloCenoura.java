package Factory;

public class BoloCenoura implements Bolo {
    @Override
    public void preparar(String ingrediente) {
        System.out.println("O bolo de cenoura feito com " + ingrediente + " foi preparado." );
    }
}
