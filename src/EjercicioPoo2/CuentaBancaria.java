package EjercicioPoo2;

public class CuentaBancaria {

    private int numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria() {
        numeroCuenta = 23;
        saldo = 344343.4343;
        titular = "Francisco";
    }

    // todo el getter
    public String Cuenta1() {
        return "Esta cuenta es de: " + this.titular + "\n cuenta con " + this.saldo + " de saldo \n" + //
                " y su numero de cuenta es " + this.numeroCuenta;
    }

    // Setters
    public void CambiarSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void CambiarTitular(String titular) {
        this.titular = titular;
    }
}
