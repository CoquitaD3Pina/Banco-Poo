package banco;


public class Cuenta {

    private String titular;
    private double saldo;  

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

    public void sumarSaldo(double monto) {
        saldo += monto;
    }

    public void restarSaldo(double monto) {
        saldo -= monto;
    }




}




    

