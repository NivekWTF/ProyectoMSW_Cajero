package Proyecto_Terminado;

import java.util.Date;

public abstract class Transaccion {
    private int id;
    private Date fecha;
    private int Tipo; // 1: Retiro - 2: Transferencia
    private double monto;

    public Transaccion(int id, Date fecha, int tipo, double monto) {
        this.id = id;
        this.fecha = fecha;
        Tipo = tipo;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int tipo) {
        Tipo = tipo;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }

}
