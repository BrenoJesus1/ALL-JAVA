package Factory;

public class SistemaFabrica {
    private final FabricaBolo fabricaBolo;

    public SistemaFabrica(FabricaBolo fabricaBolo) {
        this.fabricaBolo = fabricaBolo;
    }

    public void fabricarBolo(String ingrediente) {
        Bolo bolo = fabricaBolo.criarBolo();
        bolo.preparar(ingrediente);
    }
}
