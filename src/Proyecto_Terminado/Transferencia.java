package Proyecto_Terminado;
import java.util.Date;

public class Transferencia extends Transaccion {
    private Cuenta cuentaDestino;

    public Transferencia(int id, Date fecha, int tipo, double monto,Cuenta cuentaDestino) {
        super(id,fecha,tipo,monto);
        this.cuentaDestino = cuentaDestino;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
}
