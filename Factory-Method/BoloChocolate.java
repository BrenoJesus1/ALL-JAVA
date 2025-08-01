package Factory;

public class BoloChocolate implements Bolo {
    @Override
    public void preparar(String ingrediente) {
        System.out.println("O bolo de chocolate feito com " + ingrediente + " foi preparado." );
    }
}
