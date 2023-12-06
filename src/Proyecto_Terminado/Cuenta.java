package Proyecto_Terminado;

public class Cuenta {
    private double saldo;
    private String numeroCuenta;
    
    public Cuenta(double saldoInicial, String numeroCuenta) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta () {
        this.saldo = 1000;
        this.numeroCuenta = "1234";
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numero_cuenta) {
        this.numeroCuenta = numero_cuenta;
    }
}
