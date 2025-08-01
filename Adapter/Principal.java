package Adapter;

public class Principal {
    public static void main(String[] args) {

        BuracoRedondo b1 = new BuracoRedondo(3.0);
        
        PinoRedondoConcreto r1 = new PinoRedondoConcreto(3.0);

        PinoQuadrado q1 = new PinoQuadrado(3.0);
        PinoQuadrado q2 = new PinoQuadrado(15.0);

        AdaptadorPinoQuadrado a1 = new AdaptadorPinoQuadrado(q1);
        AdaptadorPinoQuadrado a2 = new AdaptadorPinoQuadrado(q2);

        System.out.println("O pino redondo encaixa? " + b1.verificacaoEncaixe(r1));
        System.out.println("O pino quadrado encaixa? " + b1.verificacaoEncaixe(a1));
        System.out.println("O pino redondo encaixa? " + b1.verificacaoEncaixe(a2));
        

    }
}
