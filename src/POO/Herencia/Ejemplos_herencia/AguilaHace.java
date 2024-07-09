package POO.Herencia.Ejemplos_herencia;


public class AguilaHace {

    public static void main(String[] args) {
        
        // Pajaro aguilaHace = new Pajaro();
        Aguila accionAguila = new Aguila(2,"Garras" );
        
        // System.out.println(aguilaHace.TieneCrias());
        System.out.println(accionAguila.AguilaCaza());
    }
}
