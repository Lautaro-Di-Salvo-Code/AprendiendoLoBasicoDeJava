public class Array {
    public static void main(String[] args) {

        // Una forma de hacer arrays
        // String[] nombres = { "Carla", "Augusto", "Carlos" };
        // otra forma de hacer arrays
        int numeros[] = new int[4];
        int numeros2[] = {4, 76, 56, 34, 8, 90, 90, 54, 34 };


        numeros[0] = 23;
        numeros[1] = 4;
        numeros[2] = 7;
        numeros[3] = 9;

        for (int i : numeros2) {
            int indice = 0;
            System.out.println("El indice: "+ indice++ + " El valor: "+ i);
        }



        
    }
}
