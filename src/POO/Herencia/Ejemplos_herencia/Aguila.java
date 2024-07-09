package POO.Herencia.Ejemplos_herencia;

import POO.Pajaro;

public class Aguila extends Pajaro {
    private int medida_alas;
    private String Garras;

    public Aguila(int medida_alas, String Garras ){
        super();//super llama al constructor de la clase, osea Pajaro

        this.medida_alas = medida_alas;
        this.Garras = Garras;
    }

    public String AguilaCaza (){
        return "El aguila caza con sus enormes alas cuya medida supera los "+ this.medida_alas+ " metros" +"\n" +" y cuenta con "+ this.Garras + " para cazar";
    }
}



