package Factory;

public class FabricaBoloMorango extends FabricaBolo {
    @Override
    public Bolo criarBolo() {
        return new BoloMorango();
    }
}