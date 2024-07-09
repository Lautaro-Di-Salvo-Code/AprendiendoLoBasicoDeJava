package POO.Herencia.EjerciciosHerencia.cuenta_bancaria;

class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public static double saldoSumatorio;
    private String titular;
    public int id;
    // el metodo static es un valor que es unico y constante y que puede compartirse entre varias cosas, como por ejemplo PI (3,14)
    public static int idSumatorio = 1;

    public void SeguimientoBancario(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.id = idSumatorio;
        idSumatorio++;
    }

    public String DatosUsuario() {
        return "El titular se llama: " + this.titular + " su Id de usuario es: " + this.id + " su saldo es de: "
                + this.saldo;
    }

    // public void IncrementaSaldo(double saldo){
    // this.saldo += saldo;
    // }
    // public void RetirarSaldo(double saldo){
    // this.saldo -= saldo;
    // }

}

public class LeerUsuario {
    public static void main(String[] args) {
        CuentaBancaria leerUsuario1 = new CuentaBancaria();
        CuentaBancaria leerUsuario2 = new CuentaBancaria();
        CuentaBancaria leerUsuario3 = new CuentaBancaria();
        CuentaBancaria leerUsuario4 = new CuentaBancaria();
        CuentaBancaria leerUsuario5 = new CuentaBancaria();
        CuentaBancaria leerUsuario6 = new CuentaBancaria();
        CuentaBancaria leerUsuario7 = new CuentaBancaria();
        leerUsuario1.SeguimientoBancario(0, "Gerardo", 500.4);
        leerUsuario2.SeguimientoBancario(0, "Sebastian", 400.6);
        leerUsuario3.SeguimientoBancario(0, "Carlos", 300.7);
        leerUsuario4.SeguimientoBancario(500, "Roberto", 200.6);
        leerUsuario5.SeguimientoBancario(0, "Carla", 600.4);
        leerUsuario6.SeguimientoBancario(0, "Melina", 500.0);
        leerUsuario7.SeguimientoBancario(0, "Rodrigo", 600.3);

        System.out.println(leerUsuario1.DatosUsuario()
                +
                "\n" + leerUsuario2.DatosUsuario() +
                "\n" + leerUsuario3.DatosUsuario() +
                "\n" + leerUsuario4.DatosUsuario() +
                "\n" + leerUsuario5.DatosUsuario() +
                "\n" + leerUsuario6.DatosUsuario() +
                "\n" + leerUsuario7.DatosUsuario());

    }
}