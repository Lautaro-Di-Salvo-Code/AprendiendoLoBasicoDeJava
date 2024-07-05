package POO;

public class Pajaro {
    // Pajaro
    private int alas;
    private int patas;
    private String EspeciePajaro;
    private String AlimentacionPor;
    private String Sonido;
    private String MetReproduccion;
    private boolean Crias;

    // esto es el Constructor o el chasis de donde se empieza a extender todo
    public Pajaro() {
        alas = 2;
        AlimentacionPor = "Pico";
        patas = 2;
        Sonido = "Cacarea";
        EspeciePajaro = "Aguila";
        MetReproduccion = "Oviparo";

    }

    // Esto es un getter, como en el ejemplo del reproductor de musica,
    // con esto podes ver la funcion de un modulo por separado que esté en privado
    public String Accion() {
        return "El pajaro " + Sonido + " y tiene " + AlimentacionPor;
    }

    // Setter, le da acceso al objeto de cambiar el valor del constructor y
    // devolverlo cambiado
    public void SonidoCambiado(String Sonido) {
        this.Sonido = Sonido;
    }

    public void TieneCrias(String TieneCrias) {

        if (TieneCrias.equals("si")
                || TieneCrias.equals("Si")) {
            this.Crias = true;
        } else {
            this.Crias = false;
        }

    }

    public String SiTieneCrias() {
        if (Crias) {
            return "El pajaro SI tuvo crias";
        }
        return "El pajaro no tuvo crias";

    }
}
