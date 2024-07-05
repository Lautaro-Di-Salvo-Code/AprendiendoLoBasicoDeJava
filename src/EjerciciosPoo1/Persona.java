package EjerciciosPoo1;
public class Persona {

    private String nombre;
    private int edad;
    private double altura;

    public Persona() {
        nombre = "Carlos";
        edad = 34;
        altura = 1.75;
    }

    // Getter
    public String PersonaNombre() {
        return "Esta persona se llama "+  this.nombre ;
    }

    public String  PersEdad (int edad ){
        return "Y tiene " + this.edad+ " años";
    }

    public String  PersAltura (double altura ){
        return "Y mide " +this.altura+ " de estatura";
    }

    // Setter
    public void  PersonaNombreCambia (String nombre){
        this.nombre = nombre;
    }
    public void  PersonaEdadCambia (int edad){
        this.edad = edad;
    }
    public void  PersonaAlturaCambia (double altura){
        this.altura = altura;
    }

}
