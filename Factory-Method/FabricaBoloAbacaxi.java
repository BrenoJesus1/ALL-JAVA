package Factory;

public class FabricaBoloAbacaxi extends FabricaBolo {
    @Override
    public Bolo criarBolo() {
        return new BoloAbacaxi();
    }
}
