package POO.Herencia.EjerciciosHerencia.Libros;

public class ItemBiblioteca {
    private String titulo;
    private int añoPublicacion;


    public String MostrarLibro(){
        return "El libro se llama: " + this.titulo +" se publicó el año " + this.añoPublicacion;
    }

    public void CambioLibro(String titulo,int añoPublicacion ){
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }
}

