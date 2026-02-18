package banco;

import banco.exceptions.SaldoInsuficienteException;
import banco.exceptions.BusinessException;

public class CuentaService {

    public void depositar(Cuenta cuenta, double monto) {

        if (monto <= 0) {
            throw new BusinessException("El monto debe ser mayor a 0");
        }

        cuenta.sumarSaldo(monto);
    }

    public void retirar(Cuenta cuenta, double monto) {

        if (monto <= 0) {
            throw new BusinessException("El monto debe ser mayor a 0");
        }

        if (cuenta.getSaldo() < monto) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        cuenta.restarSaldo(monto);
    }
}

