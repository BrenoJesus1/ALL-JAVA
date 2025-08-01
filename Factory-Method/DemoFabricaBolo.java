package Factory;

public class DemoFabricaBolo {
    public static void main(String[] args) {

        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();
        SistemaFabrica sistemaAbacaxi = new SistemaFabrica(fabricaAbacaxi);
        sistemaAbacaxi.fabricarBolo("farinha, açúcar, ovos e abacaxi");

        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();
        SistemaFabrica sistemaCenoura = new SistemaFabrica(fabricaCenoura);
        sistemaCenoura.fabricarBolo("farinha, açúcar, ovos e cenoura");

        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        SistemaFabrica sistemaChocolate = new SistemaFabrica(fabricaChocolate);
        sistemaChocolate.fabricarBolo("farinha, açúcar, ovos e chocolate");

        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        SistemaFabrica sistemaMorango = new SistemaFabrica(fabricaMorango);
        sistemaMorango.fabricarBolo("farinha, açúcar, ovos e morango");
        fabricaMorango.fazerBolo();
    }
}
