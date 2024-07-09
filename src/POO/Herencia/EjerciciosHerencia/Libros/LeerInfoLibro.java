package POO.Herencia.EjerciciosHerencia.Libros;

public class LeerInfoLibro {
    public static void main(String[] args) {
        HerenciaLibro infoLibro = new HerenciaLibro("Edgar Allan Poe", 150);
        infoLibro.CambioLibro("Harry potter", 1990);

        System.out.println(infoLibro.MostrarLibro());
        System.out.println(infoLibro.LeerMasInfoLibro());
    }
}
