package EjercicioPoo3;

public class ObjetoLibro {

    public static void main(String[] args) {
        Libro dataLibro = new Libro();
        dataLibro.CambioPrecioLibro(130.4);
        dataLibro.CambioTituloLibro("Harry Potter");

        System.out.println(dataLibro.DatosLibro());
    }
}
