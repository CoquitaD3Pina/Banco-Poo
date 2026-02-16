package banco;

import java.util.ArrayList;

public class Cuenta {
    private String titular;
    private double saldo;  
    private ArrayList<Movimientos> movimiento = new ArrayList<>();

    public Cuenta() {

    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean ingresar1(double cantidad) {
    if (cantidad > 0) {
        this.saldo += cantidad;

        Movimientos m = new Movimientos(
            movimiento.size() + 1, "INGRESO",cantidad,"14/02/2026");
            movimiento.add(m);
            return true;
        }
    return false;
    }

    public boolean retirar1(double cantidad) {
        if(cantidad > 0 && cantidad <= this.saldo){
            this.saldo -= cantidad;
            Movimientos m = new Movimientos(
            movimiento.size() + 1, "RETIRO",cantidad,"14/02/2026");
            movimiento.add(m);
            return true;
        }
        return false;
    }

    public boolean transferir(Cuenta cuentaDestino, double cantidad) {
        if (cuentaDestino == null ){
            return false;
        } if (cuentaDestino == this){
            return false;
        }if (this.retirar1(cantidad)) {
            cuentaDestino.ingresar1(cantidad);
        return true;
        }
    return false;

    }
    public String listaDeMovimientos() {

         String historial = "";

        for ( Movimientos m : movimiento) {
             historial += "ID: " + m.getId()
                + " | Tipo: " + m.getTipo()
                + " | Cantidad: " + m.getCantidad()
                + " | Fecha: " + m.getFecha()
                + "\n";
        }

        return historial;
    }


}




    

