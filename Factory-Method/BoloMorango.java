package Factory;

public class BoloMorango implements Bolo {
    @Override
    public void preparar(String ingrediente) {
        System.out.println("O bolo de morango feito com " + ingrediente + " foi preparado." );
    }
}
