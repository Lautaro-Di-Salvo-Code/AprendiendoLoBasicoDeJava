package EjercicioPoo3;

public class Libro {

    String titulo;
    String autor;
    double precio;

    public Libro(){
        titulo = "Corazon Delator";
        autor = "Edgar allan Poe";
        precio = 150.3;
    }
    public String DatosLibro(){
        return"El libro se llama "+ this.titulo + "\n su autor se llama "+ this.autor + "\n su precio es de " + this.precio;
    }
    public void CambioTituloLibro(String autor){
        this.autor = autor;
    }
    public void CambioautorLibro(String titulo){
        this.titulo = titulo;
    }
    public void CambioPrecioLibro(double precio){
        this.precio = precio;
    }
}
