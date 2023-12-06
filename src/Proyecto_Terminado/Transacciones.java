package Proyecto_Terminado;

public interface Transacciones {

    // Método para transferir una cantidad de dinero desde esta cuenta a otra cuenta
    Transaccion transferir(Cuenta cuentaOrigen,Cuenta cuentaDestino, int tipo, double monto);

    // Método para retirar una cantidad de dinero de esta cuenta
    Transaccion retirar(Cuenta cuenta, int tipo, double monto);
}
