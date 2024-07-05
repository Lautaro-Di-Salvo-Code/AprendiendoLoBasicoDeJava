package POO;

public class CaracteristicasPajaro {

    // Siempre hay que abrir un public statin main para que tenga funcion el objeto, sinó no arranca
    public static void main(String[] args) {

        // Este es el objeto del cual se extiende gracias a que hicimos el Constructor antes
        Pajaro Aguila = new Pajaro();
        Aguila.SonidoCambiado("Ladra");
        Aguila.TieneCrias("si");

        System.out.println("Setter activado => "+ Aguila.Accion());
        System.out.println("Crias pajaro: "+ Aguila.SiTieneCrias());
        // System.out.println("El "+ Aguila.EspeciePajaro + " tiene " + Aguila.alas + " alas");
        // System.out.println("Su metodo de comunicacion es el "+ Aguila.Sonido);
        // System.out.println("tiene crias poniendo huevos, eso se le llama "+ Aguila.MetReproduccion);
    }




}
