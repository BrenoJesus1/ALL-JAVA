package Factory;

public class FabricaBoloChocolate extends FabricaBolo {
    @Override
    public Bolo criarBolo() {
        return new BoloChocolate();
    }
}
