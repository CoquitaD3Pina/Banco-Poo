package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta("Adrian", 1000);
        CuentaService service = new CuentaService();

        boolean salir = false;

        System.out.println("=== Bienvenido al banco ===");

        while (!salir) {
            System.out.println("\n¿Qué transacción desea hacer?");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese monto a depositar: ");
                        double monto = scanner.nextDouble();
                        scanner.nextLine();
                        service.depositar(cuenta, monto);
                        System.out.println("Depósito realizado con éxito. Saldo actual: " + cuenta.getSaldo());
                    }
                    case 2 -> {
                        System.out.print("Ingrese monto a retirar: ");
                        double monto = scanner.nextDouble();
                        scanner.nextLine();
                        service.retirar(cuenta, monto);
                        System.out.println("Retiro realizado con éxito. Saldo actual: " + cuenta.getSaldo());
                    }
                    case 3 -> System.out.println("Saldo actual: " + cuenta.getSaldo());
                    case 4 -> {
                        System.out.println("Gracias por usar el banco. ¡Hasta luego!");
                        salir = true;
                    }
                    default -> System.out.println("Opción inválida");
                }
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

