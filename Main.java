package banco;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Adrian", 1000);
        Cuenta cuenta2 = new Cuenta("Vampiro", 500);

        System.out.println("Saldo inicial cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo inicial cuenta2: " + cuenta2.getSaldo());

        cuenta1.transferir(cuenta2, 500);
        System.out.println("Saldo final cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo final cuenta2: " + cuenta2.getSaldo());

        

    }    
}