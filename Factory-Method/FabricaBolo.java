package Factory;

public abstract class FabricaBolo {
    abstract Bolo criarBolo();
    void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar("Farinha, açucar, ovos e fermento");        
    }
}
