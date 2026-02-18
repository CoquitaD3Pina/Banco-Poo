package banco;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Adrian", 1000);
        CuentaService service = new CuentaService();

        try{
        service.depositar(cuenta, 500);
        service.retirar(cuenta, 5);
        }catch(RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
