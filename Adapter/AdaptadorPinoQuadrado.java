package Adapter;

public class AdaptadorPinoQuadrado implements PinoRedondo {
    
    private final PinoQuadrado pino;

    public AdaptadorPinoQuadrado(PinoQuadrado pino) {
        this.pino = pino;
    }

    @Override
    public double getRaio() {       
        return (pino.getLargura() * Math.sqrt(2)) / 2;
    }
    
}
